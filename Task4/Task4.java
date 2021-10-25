package com.company;
import java.lang.String;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Person personOne = new Person("Nick", 2002);;
        personOne.output();
        System.out.println("Probably, your age is: " + personOne.age());
        System.out.println();

        Person personTwo = new Person("Max", 2003);
        personTwo.output();
        System.out.println("Probably, your age is: " + personTwo.age());
        System.out.println();

        Person personThree = new Person();
        personThree.input();
        System.out.println("Your name is: " + personThree.getName());
        System.out.println("Your year of birth is: " + personThree.getBirthYear());
        System.out.println();

        Person personFour = new Person();
        personFour.input();
        System.out.println("Your name is: " + personFour.getName());
        System.out.println("Your year of birth is: " + personFour.getBirthYear());
        System.out.println("Probably, your age is: " + personFour.age());
        System.out.println();

        Person peronFive = new Person("Alex", 2005);
        peronFive.changeName("Alexandr");
        peronFive.output();




    }
}