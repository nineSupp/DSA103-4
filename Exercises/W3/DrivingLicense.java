package Exercises.W3;

/*
 * (Week 3)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * Note: Exercise from week 3, Laboratory L3-2.
 */

import java.util.Scanner;

public class DrivingLicense {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            
            System.out.print("ID Validity: ");
            boolean isIDValid = scanner.nextBoolean();
            
            System.out.print("Are you an employee? ");
            boolean isEmployee = scanner.nextBoolean();
            
            System.out.print("Security clearance: ");
            boolean isSecure = scanner.nextBoolean();
            
            boolean isOk = isEmployee || ((age >= 18) && isIDValid && isSecure);
            
            // Tenary conditions.
            System.out.println(isOk ? "Access granted" : "Access denied");
            
            // If-else statement.
            if (isOk) {
                System.out.println("Access granted");
            } else {
                System.out.println("Access denied");
            }
        }
    }
}
