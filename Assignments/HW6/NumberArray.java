package Assignments.HW6;

/*
 * (Homework 6)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * PA 6.4: NumberArray.java
 * 
 * ==================================================================================
 * Write a program that takes input of 1 + n lines. The first line should take the
 * value of n, which represents the number of elements in the array. Then, genereate
 * n random integers to populate the array and display the following:
 * 
 *     1. The sum of all the elements in the array.
 *     2. The maximum value in the array.
 *     3. The minimum value in the array.
 * ==================================================================================
 */

import java.util.Random;
import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
        // Taking input n from the user.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value for n: ");
        int n = scanner.nextInt();

        // Randomly generate numbers with a range of 1-100 (inclusively).
        // Once generated we will put them into an array of size n + 1.
        // Where array[0] = n. Thus, array[1] is the start.
        int[] arr = new int[n + 1];
        arr[0] = n;
        Random rd = new Random();
        for(int i = 1; i < arr.length; i++) {
            arr[i] = rd.nextInt(101);       // from 1-100
        }

        // The main mechanics. Does the sum, find the max and min at the same time.
        // We take the first array[1] as the start of comparison.
        // The loop start at the second index of an array.
        int sum = arr[1];
        int max = arr[1];
        int min = arr[1];
        for(int i = 2; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] >= max) {
                max = arr[i];
            }
            else if (arr[i] <= min) {
                min = arr[i];
            }
        }

        // Just to display the array.
        String arrayDisplay = "[";
        for(int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                arrayDisplay += arr[i] + "]";
            }
            else {
                arrayDisplay += arr[i] + ", ";
            }
        }

        System.out.println(arrayDisplay);
        System.out.printf("The sum of the array is %d%n", sum);
        System.out.printf("The maximum value in the array is %d%n", max);
        System.out.printf("The minimum value in the array is %d%n", min);

        scanner.close();
    }
}
