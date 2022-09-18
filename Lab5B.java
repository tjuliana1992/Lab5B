/*
Class: CSE 1321L
Section: WJ01
Term: Fall
Instructor: Surya Praveen Adivi
Name: Thomas Juliana
Lab#: 5
*/
import java.util.Scanner;

import static java.util.Locale.filter;

public class Lab5B {
    public static void main(String[] args) {




        int myNumber;

        myNumber = 0;

        int myNum = -1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int a = sc.nextInt();


       switch (a % 2) {
           case 0:
               System.out.println("This number is divisible by 2");
               break;
           case 1:
               System.out.println("This number is undetermined");

       }



       switch (a % 3) {
            case 0:
                System.out.println("This number is divisible by 3");
                break;
           case 1: System.out.println("This number is undetermined");






        }



        switch (a % 5) {

            case 0:

                System.out.println("This number is divisible by 5");
                break;
            case 1:  System.out.println("This number is undetermined");



    }

}}
