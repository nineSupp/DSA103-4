package Exercises.W3;

/*
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * Note: Exercise from week 4, In-class exercise 3.2.
 */

 import java.util.Scanner;

public class ScannerExercise {
    public static void main(String[] args) {
        // Java new version requires try-with to structured the Scanner.
        try (Scanner input = new Scanner(System.in)) {
            String text = input.next();
            var text2 = input.nextLine();    // Read the entire line of text.
            // Fill in the blanks to complete the following input statements.
            int d = input.nextInt();
            double e = input.nextDouble();
            long f = input.nextLong();
            boolean isHungry = input.nextBoolean();
            String text3 = input.next();
            // Print out the collected information.
            System.out.println("Text: " + text);
            System.out.println("Text2: " + text2);
            System.out.println("d: " + d);
            System.out.println("e: " + e);
            System.out.println("f: " + f);
            System.out.println("isHungry: " + isHungry);
            System.out.println("Text3: " + text3);
            // Close the scanner to free resources.
            input.close();
        }
    }
}
