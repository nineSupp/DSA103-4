package Assignments.HW3;


/*
 * (Homework 3)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * PA 3.1: ComplexEquation.java
 * 
 * ==================================================================================
 * You are required to write a Java program that will calculate the value of the
 * following mathematical equation:
 * 
 *              z = ((a^2 + b^2) x (c)^(1/2)) / (d + e)) + log(f)
 * 
 * where:
 *     1) a, b, c, d, ,e, and f are variables that will be provided by the user.
 *     2) log(f) represents the natural logarithm (base e of f).
 *     3) (c)^(1/2) represents the square root of c.
 * 
 * Example:
 * 
 *   Input:     Output:
 *    a = 3     The result of the equation is 11.054383310402145
 *    b = 4
 *    c = 16
 *    d = 2
 *    e = 3
 *    f = 7.5
 * -----------------------------------------------------------------
 *   Input:     Output:
 *     a = 1     The result of the equation is 2.6931471805599454
 *     b = 2
 *     c = 4
 *     d = 2
 *     e = 2
 *     f = 2
 * ==================================================================================
 */


import java.util.Scanner;

public class ComplexEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the input for a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the input for b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the input for c: ");
        double c = scanner.nextDouble();
        System.out.print("Enter the input for d: ");
        double d = scanner.nextDouble();
        System.out.print("Enter the input for e: ");
        double e = scanner.nextDouble();
        System.out.print("Enter the input for f: ");
        double f = scanner.nextDouble();

        double numerator = (Math.pow(a, 2) + Math.pow(b, 2)) * Math.sqrt(c);
        double denominator = d + e;

        double z = (numerator / denominator) + Math.log(f);

        System.out.printf("The result of the equation is: %.15f", z);

        scanner.close();
    }
}
