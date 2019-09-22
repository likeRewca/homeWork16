package com.hillel.howmework;

public class Person {

    protected String firstName;
    protected String lastName;
    protected int age;
    protected int height;
    protected int weight;

    /*public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public int getHeight() {
        return height;
    }
    public int getWeight() {
        return weight;
    }*/

    public Person (){
    }
    @Override
    public String toString (){
        return "Hello, my name is " + firstName + " " + lastName +
                ". \nI`m " + age + " y.o." +
                "\nMy height is " + height + " miters and my weight is " + weight + ".";
    }
}
