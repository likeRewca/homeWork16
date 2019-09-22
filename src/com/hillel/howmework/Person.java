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

    public Person (int age, int height, int weight){
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    @Override
    public String toString (){
        return "Меня зовут " + firstName + " " + lastName +
                ". \nМне " + age + " лет." +
                "\nМой рост " + height + " и мой вес " + weight;
    }
}
