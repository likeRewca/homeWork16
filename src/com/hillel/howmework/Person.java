package com.hillel.howmework;

import java.util.Random;

public class Person {
    protected String firstName;
    protected String lastName;
    protected int age;
    protected int height;
    protected int weight;
    private Random generate = new Random();

    public Person (String[] firstName, String [] lastName, int[] age, int[] height, int[] weight){
        this.firstName = firstName(firstName);
        this.lastName = lastName(lastName);
        this.age = getAge(age);
        this.height = getHeight(height);
        this.weight = getWeight(weight, height);
    }
    private String firstName(String[] firstName) {
        return firstName[generate.nextInt(8)];
    }
    private String lastName(String[] lastName) {
        return lastName[generate.nextInt(8)];
    }
    private int getAge(int[] age){
        int diff = age[1] - age[0];
        return generate.nextInt(diff+1) + age[0];
    }
    private int getHeight(int[] height){
        int diff = height[1] - height[0];
        return generate.nextInt(diff+1) + height[0];
    }
    private int getWeight(int[] weight, int[] height){
        int mainWeight =0;
        int averageHeight = (height[1]-height[0]) / 2 + height[0];
        if (this.height > height[0] && this.height <= averageHeight){
            int diff = weight[2] - weight[0];
            return generate.nextInt(diff+1) + weight[0];
        }else if (this.height > averageHeight && this.height <= height[1]){
            int diff = weight[3] - weight[1];
            return generate.nextInt(diff+1) + weight[1];
        }return mainWeight;
    }
    @Override
    public String toString (){
        return "Hello, my name is " + firstName + " " + lastName +
                ". \nI`m " + age + " y.o." +
                "\nMy height is " + height + " miters and my weight is " + weight + ".";
    }
}
