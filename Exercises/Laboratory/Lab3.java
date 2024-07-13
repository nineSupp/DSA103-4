package Exercises.Laboratory;

/*
 * (Week 3)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * Note: Exercise from week 3, Laboratory 3.
 */

import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        // Problem 1.1: Import java.util.Scanner class.
        
        // Problem 1.2: Create a Scanner object to read input from the keyboard.
        Scanner scanner = new Scanner(System.in);

        // Problem 1.3: Prompt the user to enter their name (String).
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Problem 1.4: Prompt the user to enter their age (int).
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Problem 1.5: Prompt the user to enter their GPA (double).
        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        // Problem 1.6: Prompt the user to enter whether they are a full-time student (boolean).
        System.out.print("Are you a full-time student: ");
        boolean isFullTime = scanner.nextBoolean();

        // Problem 1.8: Print out the collected information.
        System.out.println("Name: " + name);
        System.out.println( "Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Full-time student: " + isFullTime);

        // *** Always close Scanner.
        scanner.close();
    }
}
