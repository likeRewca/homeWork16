package com.hillel.howmework;

import java.util.Random;

public class CreationPerson extends Person {
    protected static int height;

    public CreationPerson(){
        super(firstName(),
                lastName(),
                getRandomAge(),
                CreationPerson.height = getRandomHeight(),
                getRandomWeight());
    }
    private static String firstName() {
        Random generate = new Random();
        String[] firstName = {"John", "Marcus", "Susan", "Henry", "Harry", "Ron", "Barrie", "Fabian",
                "Mary", "Camilla", "Susan", "Daysie", "Alexis", "Adele", "Emma", "Gloria"};
        return firstName[generate.nextInt(16)];
    }
    private static String lastName() {
        Random generate = new Random();
        String[] lastName = {"Smith", "Johnson", "Brown", "Aly", "Davis", "Potter", "Wilson", "Black"};;
        return lastName[generate.nextInt(8)];
    }
    private static int getRandomAge(){
        Random generate = new Random();
        int[] age = {20, 40};
        int diff = age[1] - age[0];
        return generate.nextInt(diff+1) + age[0];
    }
    private static int getRandomHeight(){
        Random generate = new Random();
        int[] height = {165, 200};
        int diff = height[1] - height[0];
        return generate.nextInt(diff+1) + height[0];
    }
    private static int getRandomWeight(){
        Random generate = new Random();
        int[] weight = {60, 80, 81, 100};
        int[] height = {165, 200};
        int mainWeight =0;
        int averageHeight = (height[1]-height[0]) / 2 + height[0];
        if (CreationPerson.height > height[0] && CreationPerson.height <= averageHeight){
            int diff = weight[1] - weight[0];
            return generate.nextInt(diff+1) + weight[0];
        }else if (CreationPerson.height > averageHeight && CreationPerson.height <= height[1]){
            int diff = weight[3] - weight[2];
            return generate.nextInt(diff+1) + weight[2];
        }return mainWeight;
    }
}
