package com.hillel.howmework;

public class Main {
    public static void main(String[] args) {

        Person firstPerson = new Man(21, 190, 70);
        Person secondPerson = new Woman(20, 168, 55);

        System.out.println(firstPerson.toString());
        System.out.println("=========================");
        System.out.println(secondPerson.toString());

    }
}
