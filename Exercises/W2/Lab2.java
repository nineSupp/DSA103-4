package Exercises.W2;

/*
 * (Week 2)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * Note: Exercise from week 2, Laboratory 2.
 */

 
public class Lab2 {
    public static void main(String[] args) {
        // Problem 1.
        System.out.println("\"Hello World \\n" + "My Name is Chanakarn \\n" + "I'm lecturer\"");    // Output: "Hello World \nMy Name is Chanakarn \nI'm lecturer"

        // Problem 2.
        System.out.println("사건은 다가와, ah-oh, ayy\n거세게 커져가, ah-oh, ayy\nThat tick, that tick, tick bomb\nThat tick, that tick, tick bomb\n감히 건드리지 못할 걸 (누구도 말이야)\n지금 내 안에선 (su-su-su-supernova)");

        System.out.println(" ");
    
        // Problem 4.
        int A = 5;
        int B = 11;
        double C = 99;
        int D = 29;
        int E = 8;
        int F = 1;
        double G = 5.5;
        int H = 3;

        int X = D * E;
        double Y = F + G;

        System.out.println(A + B * C / X - Y - H);

        System.out.println(" ");

        // Problem 5.
        System.out.println(Math.E);
        System.out.println(Math.PI);
        System.out.println(Math.sqrt(36));
        System.out.println(Math.pow(10, 2));
        System.out.println(Math.ceil(3.5));
        System.out.println(Math.abs(-3));
        System.out.println(Math.round(3.5));
        System.out.println(Math.floor(3.5));
        System.out.println(Math.max(3, 4));
        System.out.println(Math.random());
        System.out.println(Math.min(3, 4));
        System.out.println(Math.log(3));
        System.out.println(Math.exp(10));

        System.out.println(" ");

        // Problem 6.
        double celsius = 32.0;
        double fahrenheit = (celsius * (9.0/5.0)) + 32.0;
        System.out.println(fahrenheit);

        System.out.println(" ");

        // Problem 7.
        double fahrenheit_7 = 80.6;
        double celsius_7 = (fahrenheit_7 - 32.0) * (5.0/9.0);
        System.out.println(Math.round(celsius_7));

        System.out.println(" ");

        // Problem 8.
        int a = 1;
        int b = 3;
        int c = -4;
        double p = Math.sqrt(Math.pow(b, 2) - (4 * a * c));
        double x1 = ((-1.0 * b) + (p)) / (2 * a);
        double x2 = ((-1.0 * b) - (p)) / (2 * a);
        System.out.println(x1);
        System.out.println(x2);

        System.out.println(" ");

        // Problem 9.
        double kg = 68.2;
        double height = 1.73;
        double bmi = (kg / Math.pow(height, 2));
        System.out.println(bmi);
    }
}
