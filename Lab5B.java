
import java.util.Scanner;

public class Lab5B {
    public static void main(String[] args) {

        int numberA;


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


        }


        switch (a % 5) {

            case 0:

                System.out.println("This number is divisible by 5");
                break;


        }
    }
}
