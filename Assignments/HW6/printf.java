package Assignments.HW6;

/*
 * (Homework 6)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * PA 6.1: printf.java
 * 
 * ==================================================================================
 * Print the following outputs using print formatting in Java.
 * 
 *      Printf                               Output
 *    System.out.printf("%d%n", i)            3277
 *                                           132324.26
 *                                           003277
 *                                           3,277
 *                                           132,324.255556
 *                                             3277 //(2 spaces)
 *                                           3277.00
 *                                           +3,277
 *                                           +132,324.256


 * ==================================================================================
 */


public class printf {
    public static void main(String[] args) {
        System.out.printf("%.2f%n", 132324.26);
        System.out.printf("%06d%n", 3277);
        System.out.printf("%,5d%n", 3277);
        System.out.printf("%,14.6f%n", 132_324.255556);
        System.out.printf("%6d%n", 3277);
        System.out.printf("%.2f%n", 3277.00);
        System.out.printf("%+,6d%n", 3277);
        System.out.printf("%+,11.3f%n", 132_324.256);

    }
}
