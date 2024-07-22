package Assignments.HW2;

/*
 * (Homework 2)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * PA 2.3: CentToInch.java
 * 
 * ==================================================================================
 * Write a program to convert centimeters to inches, where 1cm = 0.393701 inches.
 * Write the code, and define 'double centimeter = 3.34;'. Display the result as
 * follows, and when the value of the centimeter variable is changed, the displayed
 * value should also change accordingly. Example:
 * Converting 3.34 cm = 1.314961 inches.
 * ==================================================================================
 */


public class CentToInch {
    public static void main(String[] args) {
        double centimeter = 3.34;
        double inches = centimeter * 0.393701;
        System.out.println(centimeter + " cm = " + inches + " inches.");
    }
}
