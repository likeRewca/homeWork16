package com.hillel.howmework;

import java.util.Random;

public class CreationPerson extends Person {
    protected static int height;

    public CreationPerson(String[] firstNameArray, String [] lastNameArray, int[] ageArray, int[] heightArray, int[] weightArray){
        super(firstName(firstNameArray),
                lastName(lastNameArray),
                getAge(ageArray),
                CreationPerson.height = getHeight(heightArray),
                getWeight(weightArray,heightArray));
    }
    private static String firstName(String[] firstName) {
        Random generate = new Random();
        return firstName[generate.nextInt(8)];
    }
    private static String lastName(String[] lastName) {
        Random generate = new Random();
        return lastName[generate.nextInt(8)];
    }
    private static int getAge(int[] age){
        Random generate = new Random();
        int diff = age[1] - age[0];
        return generate.nextInt(diff+1) + age[0];
    }
    private static int getHeight(int[] height){
        Random generate = new Random();
        int diff = height[1] - height[0];
        return generate.nextInt(diff+1) + height[0];
    }
    private static int getWeight(int[] weight, int[] height){
        Random generate = new Random();
        int mainWeight =0;
        int averageHeight = (height[1]-height[0]) / 2 + height[0];
        if (CreationPerson.height > height[0] && CreationPerson.height <= averageHeight){
            int diff = weight[2] - weight[0];
            return generate.nextInt(diff+1) + weight[0];
        }else if (CreationPerson.height > averageHeight && CreationPerson.height <= height[1]){
            int diff = weight[3] - weight[1];
            return generate.nextInt(diff+1) + weight[1];
        }return mainWeight;
    }
}
