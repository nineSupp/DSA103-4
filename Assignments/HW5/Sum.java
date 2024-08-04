package Assignments.HW5;

/*
 * (Homework 5)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * PA 5.1: Sum.java
 * 
 * ==================================================================================
 * Sums the integers from 1 to n using a loop. The program prompts the user to enter 
 * a value for n, ensuring n is greater than 1. For example;
 * 
 *      Input                               Output
 *     n = 100                               5050
 * ==================================================================================
 */


import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer n (n >= 1): ");
        int n = scanner.nextInt();

        if (n >= 1) {
            int sum = 0;
            for(int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println(sum);
        }
        else {
            System.out.println("n < 1. Please enter an integer n >= 1.");
        }
        scanner.close();
    }
}
