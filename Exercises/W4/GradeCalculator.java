package Exercises.W4;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the score (0-100): ");
        double grade = scanner.nextDouble();

        if (grade >= 85 || grade <= 100) {
            System.out.println("Grade: A");
        }
        else if (grade >= 80 || grade < 85) {
            System.out.println("Grade: B");
        }
        else if (grade >= 70 || grade < 80) {
            System.out.println("Grade: C");
        }
        else if (grade >= 60 || grade < 70) {
            System.out.println("Grade: D");
        }
        else {
            System.out.println("Grade: F");
        }

        scanner.close();
    }
}
