package com.hillel.howmework;

import java.util.Random;

public class Man extends Person {

    public Man (int age, int height, int weight) {
        super(age, height, weight);
        this.firstName = firstManName();
        this.lastName = lastManName();
    }
    public String firstManName (){
        Random generate = new Random();
        String[] name = {"John", "Marcus", "Susan", "Henry", "Garry", "Ron", "Barrie", "Fabian"};
        this.firstName = name[generate.nextInt(8)];
        return firstName;
    }
    public String lastManName (){
        Random generate = new Random();
        String[] lastNameMan = {"Smith", "Johnson", "Brown", "Aly", "Davis", "Potter", "Wilson", "Black"};
        this.lastName = lastNameMan[generate.nextInt(8)];
        return lastName;
    }

}
