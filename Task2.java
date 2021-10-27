package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Input n: ");
        Scanner n = new Scanner(System.in);
        int n1 = n.nextInt();
        int Sqn = n1 * n1;
        System.out.println("n^2 = " + Sqn);


        // first subtask
        System.out.println("||||||||||||||||||||||||||||||");
        System.out.println("First subtask:");
        boolean bool = false;
        while ((Sqn != 0) && (bool != true)) {
            if (Sqn % 10 == 3) bool = true;
            Sqn = Sqn / 10;
        }
        if (bool)
            System.out.println("3 is included in n^2");
        else System.out.println("3 is NOT included in n^2");
        System.out.println("||||||||||||||||||||||||||||||");


        //second subtask
        System.out.println("Second subtask:");
        int rev = 0, temp, n2 = n1;
       do {
           temp = n2 % 10;
           rev = (rev * 10) + temp;
           n2 = n2 / 10;
       }
        while(n2 > 0);
        System.out.println("Reversed n is: " + rev);
        System.out.println("||||||||||||||||||||||||||||||");


        //third subtask
        System.out.println("Third subtask:");
        System.out.println("Will be added later :)");
        System.out.println("||||||||||||||||||||||||||||||");


        //fourth subtask
        System.out.println("Fourth subtask:");
        System.out.println("n with '1' at the begin and end: " + "1" + n1 + "1");
        System.out.println("||||||||||||||||||||||||||||||");
    }
}