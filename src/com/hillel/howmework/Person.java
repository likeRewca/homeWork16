package com.hillel.howmework;

public class Person {


    private String firstName;
    private String lastName;
    private int age;
    private int height;
    private int weight;

    public Person(String firstName, String lastName, int age, int height, int weight){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString (){
        return "Hello, my name is " + firstName + " " + lastName +
                ". \nI`m " + age + " y.o." +
                "\nMy height is " + height + " miters and my weight is " + weight + ".";
    }
}
