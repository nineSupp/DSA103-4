/*
 * MIDTERM PRACTICE MEP-PA-1.1
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * MEP-PA-1.1: LargestNumber.java
 * 
 * =====================================================================================================
 * Objective:
 * Write a Java program that prompts the user to enter three integers and determines the 
 * largest among them using the Math.max method. The program should display the result 
 * in a single line.
 * 
 * Requirements:
 *      Use the Scanner class to take three integer inputs from the user.
 *      Utilize nested Math.max methods to find the largest number.
 *      Do not declare any additional methods; implement all logic within the main method.
 *      Output the result in one concise line.
 *      Close the Scanner object after usage to prevent resource leaks.
 * 
 * Instructions:
 *      Import Necessary Packages:
 *      Import java.util.Scanner for taking user input.
 * 
 *  Implement the main Method:
 *      Create a Scanner object to read input from the user.
 *      Prompt the user to enter three integers individually.
 *      Read and store each input using appropriate Scanner methods.
 *      Use nested Math.max methods to determine the largest number among the three inputs.
 *      Print out the result in a single, well-formatted line.
 * =====================================================================================================
 */


import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        System.out.println("Enter c: ");
        int c = scanner.nextInt();

        System.out.printf("The largest number is: ", Math.pow(a, Math.pow(b, c)));

        scanner.close();
    }
}