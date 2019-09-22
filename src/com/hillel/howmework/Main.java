package com.hillel.howmework;

public class Main {
    public static void main(String[] args) {

        Person firstPerson = new Man();
        Person secondPerson = new Woman();

        System.out.println("\n" + firstPerson.toString());
        System.out.println("=========================");
        System.out.println(secondPerson.toString());
    }
}
