package com.hillel.howmework;

import java.util.Random;

public class Man extends Person {
    private Random generate = new Random();

    public Man() {
        this.firstName = firstManName();
        this.lastName = lastManName();
        this.age = getManAge();
        this.height = getManHeight();
        this.weight = getManWeight();
    }

    private String firstManName() {
        String[] name = {"John", "Marcus", "Susan", "Henry", "Garry", "Ron", "Barrie", "Fabian"};
        return name[generate.nextInt(8)];
    }

    private String lastManName() {
        String[] lastNameMan = {"Smith", "Johnson", "Brown", "Aly", "Davis", "Potter", "Wilson", "Black"};
        return lastNameMan[generate.nextInt(8)];
    }
    private int getManAge(){
        int min = 20;
        int max = 40;
        int diff = max - min;
        int age = generate.nextInt(diff+1);
        age += min;
        return age;
    }
    private int getManHeight(){
        int min = 165;
        int max = 200;
        int diff = max - min;
        int height = generate.nextInt(diff+1);
        height += min;
        return height;
    }
    private int getManWeight(){
        int weightM =0;
        if (getManHeight() > 165 && getManHeight() <=180){
            int min = 60;
            int max = 80;
            int diff = max - min;
            weightM = generate.nextInt(diff+1);
             weightM += min;
             return weightM;
        }else if (getManHeight() > 180 && getManHeight() <= 200){
            int min = 75;
            int max = 100;
            int diff = max - min;
            weightM = generate.nextInt(diff+1);
            weightM += min;
            return weightM;
        }return weightM;
    }

}
