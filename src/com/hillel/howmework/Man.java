package com.hillel.howmework;


public class Man extends Person {
    protected static String[] firstName = {"John", "Marcus", "Susan", "Henry", "Garry", "Ron", "Barrie", "Fabian"};
    protected static String[] lastName = {"Smith", "Johnson", "Brown", "Aly", "Davis", "Potter", "Wilson", "Black"};
    protected static int[] age = {20, 40};
    protected static int[] height = {165, 200};
    protected static int[] weight = {60, 75, 80, 100};

    public Man() {
        super(firstName, lastName, age, height, weight);

    }

}
