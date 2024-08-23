package Assignments.HW6;

/*
 * (Homework 6)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * PA 6.2: string.java
 * 
 * ==================================================================================
 * Using String
 *      1) Run the code below and see the output.
 * 
 *          --------------------------------------------------------------------
 *          String a = "Oak";
 *          int b = 28;
 *          double c = 3.555;
 *          System.out.printf("Hello all my name is %s I'm %d years old I have 
 *                          %.2f of GPA", a, b, c);
 *          --------------------------------------------------------------------
 * 
 * 
 *      2) Given the following portion of a code. How can you write the printf?
 * 
 *          --------------------------------------------------------------------
 *          String aa = "Karina";
 *          int bb = 25;
 *          double cc = 55.5555555;
 *          --------------------------------------------------------------------
 * 
 *        If you want to display the value as shown below,
 * 
 *          --------------------------------------------------------------------
 *          Hello my name is Karina and I'm 25 years old I am 55.56 kilograms.
 *          --------------------------------------------------------------------
 * ==================================================================================
 */


public class string {
    public static void main(String[] args) {
        String a = "Oak";
        int b = 28;
        double c = 3.555;
        System.out.printf("Hello all my name is %s I'm %d years old I have %.2f of GPA", a, b, c);
        System.out.println("");

        String aa = "Karina";
        int bb = 25;
        double cc = 55.5555555;
        System.out.printf("Hello my name is %s and I'm %d years old I am %.2f kilograms", aa, bb, cc);
        System.out.println("");
    }
}
