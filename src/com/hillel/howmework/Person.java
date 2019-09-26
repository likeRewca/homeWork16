package com.hillel.howmework;

public class Person {


    private String firstName;
    private String lastName;
    private int age;
    private int height;
    private int weight;

    public String getFirstName() {
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
    }

    private static CreationPerson person_data = new CreationPerson();
    public Person(){
        this.firstName = person_data.getFirstName();
        this.lastName = person_data.getLastName();
        this.age = person_data.getRandomAge();
        this.height = person_data.getRandomHeight();
        this.weight = person_data.getRandomWeight(this.height);
    }

    @Override
    public String toString (){
        return "Hello, my name is " + firstName + " " + lastName +
                ". \nI`m " + age + " y.o." +
                "\nMy height is " + height + " miters and my weight is " + weight + ".";
    }
}
