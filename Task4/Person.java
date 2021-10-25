package com.company;
import java.util.Scanner;

public class Person {
    private String name;
    private int birthYear;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }
    public void setBirthYear(int birthYear) {
    this.birthYear = birthYear;
        }

    public Person() {
    }


    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
        }


    public int age() {
            return 2021 - this.birthYear;
        }


    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input name, please: ");
        this.name = in.nextLine();
        System.out.print("Input year of birth: ");
        int birthYear = in.nextInt();
        this.birthYear = birthYear;

    }
    public void output() {
        System.out.println("Your name is: " + this.name);
        System.out.println("And your year of birth is: " + this.birthYear);
    }


    public void changeName(String name) {
        this.name = name;
    }









    }







