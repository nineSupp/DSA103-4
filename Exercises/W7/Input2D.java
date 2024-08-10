package Exercises.W7;

import java.util.Scanner;

public class Input2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matrix[][] = new int[5][4];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.printf("Enter the matrix[%d][%d]: ", i, j);
                matrix[i][j] = input.nextInt();
            }
        }

        // to display the matrix.
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }
}
