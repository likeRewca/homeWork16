package com.hillel.howmework;

public class Main {
    public static void main(String[] args) {
        //Тут можно выстовить до 100 цикл.
        for(int i = 1; i <= 10; i++){
            Person firstPerson = new Man();
            Person secondPerson = new Woman();
            System.out.println(i + ". " + firstPerson.toString()
                    + "\n-------------------------------------------");
            System.out.println(i + ". " + secondPerson.toString()
                    + "\n===========================================");
        }
    }
}
