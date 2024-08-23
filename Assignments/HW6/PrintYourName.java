package Assignments.HW6;

/*
 * (Homework 6)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * PA 6.3: PrintYourName.java
 * 
 * ==================================================================================
 * Print your name using array:
 *      Give the following code snippet, print out your name like so. For example,
 *      If your name is "Chanakarn" your code would look like this
 * 
 *      ----------------------------------------------------------------------------
 *      String text = "abcdefghijklmnopqrstuvwxyz";
 *      char[] c = new char[26];
 * 
 *      for(int i = 0; i < c.length; i++) {
 *          c[i] = text.charAt(i);
 *      }
 * 
 *      System.out.println(Character.toUpperCase(c[2]));
 *      System.out.print(c[7]);
 *      System.out.print(c[7]);
 *      System.out.print(c[7]);
 *      System.out.print(c[7]);
 *      System.out.print(c[7]);
 *      System.out.print(c[7]);
 *      System.out.print(c[7]);
 *      System.out.print(c[7]);
 *      System.out.println();
 *      ----------------------------------------------------------------------------
 * 
 *      Output: Chanakarn
 * ==================================================================================
 */


public class PrintYourName {
    public static void main(String[] args) {
        String text = "abcdefghijklmnopqrstuvwxyz";
        char[] c = new char[26];

        for (int i = 0; i < c.length; i++) {
            c[i] = text.charAt(i);
        }

        System.out.print(Character.toUpperCase(c[18]));
        System.out.print(c[20]);
        System.out.print(c[15]);
        System.out.print(c[15]);
        System.out.print(c[0]);
        System.out.print(c[19]);
        System.out.print(c[14]);
        System.out.print(c[20]);
        System.out.print(c[2]);
        System.out.print(c[7]);
        System.out.print(" ");
        System.out.print(Character.toUpperCase(c[18]));
        System.out.print(c[17]);
        System.out.print(c[8]);
        System.out.print(c[13]);
        System.out.print(c[20]);
        System.out.print(c[0]);
        System.out.print(c[11] + "\n");
    }
}
