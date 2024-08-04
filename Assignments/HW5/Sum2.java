package Assignments.HW5;


/*
 * (Homework 5)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * PA 5.2: Sum2.java
 * 
 * ==================================================================================
 * sum the integers from n to m, where m is greater than n. For example;
 * 
 *      Input                               Output
 *      n = 7                                 24
 *      m = 9
 * 
 *      n = 777                             198024
 *      m = 999
 * ==================================================================================
 */


import java.util.Scanner;

public class Sum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer n: ");
        int n = scanner.nextInt();
        System.out.print("Enter an integer m: ");
        int m = scanner.nextInt();

        int sum = 0;
        for(int i = n; i <= m; i++) {
            sum += i;
        }
        System.out.println(sum);
        scanner.close();
    }
}
