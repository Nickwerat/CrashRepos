package com.company;
import java.lang.String;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        System.out.println("First task about bed: ");
    Scanner num = new Scanner(System.in);
    double pi = 3.14;
    double rad, per, area;
    System.out.println("Enter radius in centimeters: ");
    rad = num.nextInt();
    per = 2*pi*rad;
    System.out.println("Perimeter is : " + per + " cm");
    area = pi*(rad*rad);
    System.out.println("Area is : " + area + " cm^2");
    System.out.println();

    System.out.println("Second task about name and address: ");
    String name1, address1;
    System.out.println("What is your name?");
    Scanner name = new Scanner(System.in);
    name1 = name.nextLine();
    System.out.println("Where are you live, " + name1 + "?");
    Scanner address = new Scanner(System.in);
    address1 = address.nextLine();
    System.out.print("So, your name is: " + name1);
    System.out.println();
    System.out.println("And your address is: " + address1);
    System.out.println();

    System.out.println("Third task about calls: ");
    double ph1, ph2, ph3;
    System.out.println("What is the cost of call from France to Ukraine per minute? (in uah)");
    Scanner fr = new Scanner(System.in);
    double fr1 = fr.nextInt();
    System.out.println("How long were the call from France? (in minutes)");
    Scanner frTime = new Scanner(System.in);
    double frTime1 = frTime.nextInt();
    ph1 = fr1*frTime1;
    System.out.println("Full cost of call from France is: " + ph1 + " uah");
    System.out.println();

    System.out.println("What is the cost of call from Poland to Ukraine per minute? (in uah)");
    Scanner pl = new Scanner(System.in);
    double pl1 = pl.nextInt();
    System.out.println("How long were the call from Poland? (in minutes)");
    Scanner plTime = new Scanner(System.in);
    double plTime1 = plTime.nextInt();
    ph2 = pl1*plTime1;
    System.out.println("Full cost of call from Poland is: " + ph2 + " uah");
    System.out.println();

    System.out.println("What is the cost of call from Germany to Ukraine per minute? (in uah)");
    Scanner gr = new Scanner(System.in);
    double gr1 = gr.nextInt();
    System.out.println("How long were the call from Germany? (in minutes)");
    Scanner grTime = new Scanner(System.in);
    double grTime1 = grTime.nextInt();
    ph3 = gr1*grTime1;
    System.out.println("Full cost of call from Germany is: " + ph3 + " uah");
    System.out.println();

    double full = ph1+ph2+ph3;
    System.out.println("And the cost of all calls is: " + full + " uah");
    }
}
