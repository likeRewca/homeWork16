package com.hillel.howmework;

import java.util.Random;

public class Woman extends Person {
    private Random generate = new Random();

    public Woman() {
        this.firstName = firstWomanName();
        this.lastName = lastWomanName();
        this.age = getWomanAge();
        this.height = getWomanHeight();
        this.weight = getWomanWeight();
    }

    private String firstWomanName() {
        String[] name = {"Mary", "Camilla", "Susan", "Daysie", "Alexis", "Adele", "Emma", "Gloria"};
        return name[generate.nextInt(8)];
    }
    private String lastWomanName() {
        String[] lastName = {"Smith", "Johnson", "Brown", "Aly", "Davis", "Potter", "Wilson", "Black"};
        return lastName[generate.nextInt(8)];
    }
    private int getWomanAge(){
        int min = 20;
        int max = 40;
        int diff = max - min;
        int age = generate.nextInt(diff+1);
        age += min;
        return age;
    }
    private int getWomanHeight(){
        int min = 150;
        int max = 180;
        int diff = max - min;
        int height = generate.nextInt(diff+1);
        height += min;
        return height;
    }
    private int getWomanWeight(){
        int weightW = 0;
        if (getWomanHeight() > 150 && getWomanHeight() <=160){
            int min = 50;
            int max = 70;
            int diff = max - min;
            weightW = generate.nextInt(diff+1);
            weightW += min;
            return weightW;
        }else if (getWomanHeight() > 160 && getWomanHeight() <= 180){
            int min = 70;
            int max = 90;
            int diff = max - min;
            weightW = generate.nextInt(diff+1);
            weightW += min;
            return weightW;
        }return weightW;
    }
}
