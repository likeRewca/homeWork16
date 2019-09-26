package com.hillel.howmework;

import java.util.Random;

public class CreationPerson {
    private static Random generate = new Random();

    public static Person creationPerson(){
        return new Person(getFirstName(), getLastName(), getRandomAge(), getRandomHeight(), getRandomWeight(getRandomHeight()));
    }
    private static String getFirstName() {
        Random generate = new Random();
        String[] firstName = {"John", "Marcus", "Susan", "Henry", "Harry", "Ron", "Barrie", "Fabian",
                "Mary", "Camilla", "Susan", "Daysie", "Alexis", "Adele", "Emma", "Gloria"};
        return firstName[generate.nextInt(16)];
    }
    private static String getLastName() {
        String[] lastName = {"Smith", "Johnson", "Brown", "Aly", "Davis", "Potter", "Wilson", "Black"};;
        return lastName[generate.nextInt(8)];
    }
    private static int getRandomAge(){
        int[] age = {20, 40};
        int diff = age[1] - age[0];
        return generate.nextInt(diff+1) + age[0];
    }
    private static int getRandomHeight(){
        int[] height = {165, 200};
        int diff = height[1] - height[0];
        return generate.nextInt(diff+1) + height[0];
    }
    private static int getRandomWeight(int nowHeight){
        int[] weight = {60, 80, 81, 100};
        int[] height = {165, 200};
        int mainWeight =0;
        int averageHeight = (height[1]-height[0]) / 2 + height[0];
        if (nowHeight > height[0] && nowHeight <= averageHeight){
            int diff = weight[1] - weight[0];
            return generate.nextInt(diff+1) + weight[0];
        }else if (nowHeight > averageHeight && nowHeight <= height[1]){
            int diff = weight[3] - weight[2];
            return generate.nextInt(diff+1) + weight[2];
        }return mainWeight;
    }
}
