package Assignments.HW2;

/*
 * (Homework 2)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * PA 2.4: GravityCalculator.java
 * 
 * ==================================================================================
 * Write a program to convert centimeters to inches, where 1cm = 0.393701 inches.
 * Write the code, and define 'double centimeter = 3.34;'. Display the result as
 * follows, and when the value of the centimeter variable is changed, the displayed
 * value should also change accordingly. Example:
 * Converting 3.34 cm = 1.314961 inches.
 * ==================================================================================
 */


public class GravityCalculator {
    public static void main(String[] args) {
        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.5 * (gravity * Math.pow(fallingTime, 2)) + (initialVelocity * fallingTime) + initialPosition;
        System.out.println("The object's position after " + fallingTime + 
                                    " seconds is " + finalPosition + " m.");
    }
}
