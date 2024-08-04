package Exercises.W5;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int num = scanner.nextInt();

        // Using for-loop.
        for(int i = 1; i <= 12; i++) {
            System.out.println(num + "*" + i + "=" + (num * i));
            // System.out.printf("%d * %d = %d", num, i, num * i);
        }

        // Using a while-loop.
        /*
        int count = 1;
        while (count <= 12) {
            System.out.println(num + "*" + count + "=" + (num * count));
        }
        */

        scanner.close();
    }
}
