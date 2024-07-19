package Exercises.Week3;

/*
 * (Week 3)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * Note: Exercise from week 3, Laboratory L3-2.
 */

import java.util.Scanner;

public class DrivingLicense {
    public static void main(String[] args) {
        /*
        Problem 1: Write a Java program that uses logical operators (&&, ||, !)
                   to make decisions based on multiple conditions. This exercise
                   will help you understand how to combine conditions using logical
                   operators.

        Problem Statement:
            You are developing a simple access control system for a secure area, The
            system grants access based on the following conditions:
                1. The user must be an adult (>=18).
                2. The user must have a valid ID.
                3. If the user is an employee, they are granted access automatically 
                   regardless of the other conditions.
                4. If the user is not an employee, they must also have a security clearance.

        Instructions:
                1. Import the Scanner class to read input from the keyboard.
                2. Read the following inputs:
                    2.1. User's age (int).
                    2.2. Whether the user has valid ID (boolean).S
                    2.3. Whether the user is an employee (boolean).
                    2.4. Whether the user has a security clearance (boolean).
                3. Use logical operators to determine if the user is granted access.
                4. Print whether the user is granted access or not.
        */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        boolean isLegal = age >= 18;

        System.out.print("ID Validity: ");
        boolean isIDValid = scanner.nextBoolean();

        System.out.print("Are you an employee? ");
        boolean isEmployee = scanner.nextBoolean();

        System.out.println("Security clearance: ");
        boolean isSecure = scanner.nextBoolean();

    }
}
