package Exercises.W5;

public class reverseOrder {
    public static void main(String[] args) {
        // Using for-loop.
        /*
        for(int i = 3000; i >= 1500; i -= 2) {
            System.out.println(i);
        }
        */

        // Using a while-loop.
        /*
        int count = 3000;
        while (count >= 1500) {
            System.out.println(count);
        }
        */

        // divisible by 5.
        /*
        for(int i = 3000; i <= 1000; i--) {
            if (i % 5 == 0) { System.out.println(i); }
        
        }
        */

        int i = 3000;
        do {
            if (i % 5 == 0) { System.out.println(i);}

        } while(i >= 1500);
    }
}
