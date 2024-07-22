package Exercises.Week3;

/*
 * (Week 3)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * Note: Exercise from week 4, Laboratory L3-3.
 */

import java.util.Scanner;

public class ScanBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        System.out.print("Enter your height in kilograms: ");
        double weight = scanner.nextDouble();

        double BMI = weight / Math.pow(height, 2);

        System.out.printf("Your BMI is: %.2f", BMI);

        scanner.close();
    }
}
