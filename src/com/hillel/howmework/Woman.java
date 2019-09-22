package com.hillel.howmework;

import java.util.Random;

public class Woman extends Person {
    public Woman (int age, int height, int weight) {
        super(age, height, weight);
        this.firstName = firstWomanName();
        this.lastName = lastWomanName();
    }

    public String firstWomanName (){
        Random generate = new Random();
        String[] name = {"Mary", "Camilla", "Susan", "Daysie", "Alexis", "Adele", "Emma", "Gloria"};
        return name[generate.nextInt(8)];
    }
    public String lastWomanName (){
        Random generate = new Random();
        String[] lastName = {"Smith", "Johnson", "Brown", "Aly", "Davis", "Potter", "Wilson", "Black"};
        return lastName[generate.nextInt(8)];
    }

}
