package Exercises.W7;

public class Array2DShort {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 6, 11, 16}, {2, 7, 12, 17},
                {3, 8, 13, 18}, {4, 9, 14, 19}, {5, 10, 15, 20}};

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
        // System.out.println(matrix.length);
        // System.out.println(matrix[0].length);
        // System.out.println(matrix[5].length);
        // System.out.println(matrix[3][2]);
        // System.out.println(matrix[2][3]);
        // System.out.println(matrix[5][5]);
        // System.out.println(matrix[3][3]);
        // System.out.println(matrix[3][0]);
        // System.out.println(matrix[0][3]);
        
    }
}
