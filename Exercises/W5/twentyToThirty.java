package Exercises.W5;

public class twentyToThirty {
    public static void main(String[] args) {
        // Using for-loop.
        /*
        String outputFor = "";
        for(int i = 20; i <= 30; i++) {
            if (i == 30) { outputFor += i; }
            else { outputFor += i + " "; }
        }
        System.out.println(outputFor);
        */

        // Using a while-loop.
        String outputWhile = "";
        int count = 20;
        while (count <= 30) {
            if (count == 30) { outputWhile += count; }
            else { outputWhile += count + " "; }
            count++;
        }
        System.out.println(outputWhile);

        // Using a do--while loop.
        /*
        int j = 20;
        String outputDoWhile = "";
        do {
            if (j == 30) { outputDoWhile += j; }
            else { outputDoWhile += j + " "; }
            j++;
        } while (j <= 30);
        System.out.println(outputDoWhile);
        */
    }
}
