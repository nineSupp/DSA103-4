package Exercises.W5;

public class zeroTo3Thousand {
    public static void main(String[] args) {
        // Using for-loop.
        /*
        for(int i = 0; i <= 3000; i += 2) {
            System.out.println(i);
        }
        */

        // Using a while-loop.
        /*
        int i = 0;
        while(i <= 3000) {
            System.out.println(i);
            i += 2;
        }
        */

        // Using a do-while-loop.
        int i = 0;
        do {
            System.out.println(i);
            i += 2;
        } while(i <= 3000);
    }
}
