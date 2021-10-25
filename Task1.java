package com.company;
import java.lang.String;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        double l1, w1, h1, w2, h2;
        System.out.println("Enter the length, height and width of brick in centimeters (only positive values): ");
        System.out.print("length: ");
        Scanner l = new Scanner(System.in);
        l1 = l.nextInt();
        System.out.print("height: ");
        Scanner h = new Scanner(System.in);
        h1 = h.nextInt();
        System.out.print("width: ");
        Scanner w = new Scanner(System.in);
        w1 = w.nextInt();
        System.out.println("And now enter the height and width of hole in centimeters (only positive values): ");
        System.out.print("height: ");
        Scanner hh = new Scanner(System.in);
        h2 = hh.nextInt();
        System.out.print("width: ");
        Scanner wh = new Scanner(System.in);
        w2 = wh.nextInt();
        if ((w2 >= l1 && h2 >= w1) || (w2 >= w1 && h2 >= l1)) {
            System.out.println("Brick will go through the hole");
        } else if ((w2 >= h1 && h2 >= w1) || (w2 >= w1 && h2 >= h1)) {
            System.out.println("Brick will go through the hole");
        } else if ((w2 >= l1 && h2 >= h1) || (w2 >= h1 && h2 >= l1)) {
            System.out.println("Brick will go through the hole");
        } else {
            System.out.println("Brick wont go through the hole");
        }
    }
}