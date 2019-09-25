package com.hillel.howmework;

public class Main {
    public static void main(String[] args) {
        //Тут можно выстовить до 100 цикл.
        for(int i = 1; i <= 100; i++){
            Person firstPerson = new CreationPerson();
            System.out.println(i + ". " + firstPerson.toString()
                    + "\n--------------------------------------------");
        }
    }
}
