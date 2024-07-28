package Exercises.W3;

/*
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * Note: Exercise from week 2, In-class exercise 2.1.
 */

public class ICS31 {
    /*
     * Given the following variable declarations:
     *      int x = 3;
     *      int y = 5;
     *      boolean z = true;
     * 
     * Determine the truth value (true or false) of the following propositions:
     *      1. (x > y) || (x == y)
     *      2. !(x == y) && z
     *      3. !z && z || !z
     *      4. (x != y) && (x > -y)
     *      5. x + y >= x && z
     */
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        boolean z = true;

        System.out.println((x > y) || (x == y));
        System.out.println(!(x == y) && z);
        System.out.println(!z && z || !z);
        System.out.println((x != y) && (x > -y));
        System.out.println(x + y >= x && z);
    }
}
