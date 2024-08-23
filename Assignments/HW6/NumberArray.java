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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value for n: ");
        int n = scanner.nextInt();

        int[] arr = new int[n + 1];
        arr[0] = n;
        Random rd = new Random();
        for(int i = 1; i < arr.length; i++) {
            arr[i] = rd.nextInt(101);
        }

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





/*
 * Empire state goes green, The tallest building in NYC
 * environmental makeover.
 * open 1931. 443 m talls for many years.
 * Makeover will reduce engery use by 30% save 4 mill per year.
 * have 6500 windows, new glass innsulated will make warming in winter.
 * 
 * energy efficient lights, modern cooling system.
 * 
 * 100 thoudsands tons of co2 release. Reduce green house gases. 80% of greenhouse from city building
 * 
 * 1 improvement = 12 mill dollar
 */
