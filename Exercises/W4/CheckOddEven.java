package Exercises.W4;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        /* Lab 4.1: Write a program called CheckPassFail which prints "PASS" 
                    if the int variable "mark" is more than or equal to 50; 
                    or prints "FAIL" otherwise.

            int number = 49;
            System.out.println("The number is " + number);
            if (number % 2 == 0) {
                System.out.println("Even Number");
            } else {
                System.out.println("Odd Number");
            }
        */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("Is even.");
        } else {
            System.out.println("Is odd.");
        }

        scanner.close();
    }
}
