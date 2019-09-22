package com.hillel.howmework;

public class Main {
    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++){
            Person firstPerson = new Man();
            Person secondPerson = new Woman();
            System.out.println(firstPerson.toString() + "\n=============================");
            System.out.println(secondPerson.toString() + "\n=============================");
        }
    }
}
