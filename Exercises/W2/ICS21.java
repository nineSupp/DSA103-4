package Exercises.W2;

/*
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * Note: Exercise ICA 2.1: In-Class Assignment 2.1
 */


 /*
 * =======================================================================
 * ICA 2.1: In-Class Assignment 2.1
 * 
 * Exercise to practice choosing the right data types in Java. For each
 * scenario, choose the most appropriate data type and write a declaration
 * statement.
 *      1. Store the age of a person.
 *      2. Store the population of a city.
 *      3. Store the value of π (pi) accurately.
 *      4. Store a single character 'A'.
 *      5. Store the name of a book.
 *      6. Store whether a light is on or off.
 *      7. Store the annual salary of an employee.
 *      8. Store the distance between two cities in kilometers.
 *      9. Store the price of an item in a store with two decimal points.
 *     10. Store the number of students in a classroom.
 * =======================================================================
*/


public class ICS21 {
    public static void main(String[] args) {
        int age = 34;
        long population = 70_000_000L;
        double pi = 3.14;
        char character = 'A';
        String bookName = "Harry Potter";
        boolean isOn = true;
        double salary = 34025.67;
        double distance = 121.33;
        float storePrice = 32.45f;
        int numStudent = 30;

        System.out.println(age);            // Output: 34
        System.out.println(population);     // Output: 70000000
        System.out.println(pi);             // Output: 3.14
        System.out.println(character);      // Output: A
        System.out.println(bookName);       // Output: Harry Potter
        System.out.println(isOn);           // Output: true
        System.out.println(salary);         // Output: 34025.67
        System.out.println(distance);       // Output: 121.33
        System.out.println(storePrice);     // Output: 32.45
        System.out.println(numStudent);     // Output: 30
    }
}
