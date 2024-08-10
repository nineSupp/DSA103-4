package Exercises.W7;

// import java.util.Scanner;

public class basicArray {
    public static void main(String[] args) {
        // int score1, score2, score3, score4, score5;
        // Scanner input = new Scanner(System.in);

        // score1 = input.nextInt();
        // score2 = input.nextInt();
        // score3 = input.nextInt();
        // score4 = input.nextInt();
        // score5 = input.nextInt();

        // int[] listScores = new int[]{score1, score2, score3, score4, score5};

        // int[] listOf1000Students = new int[1000];
        // for(int i = 0; i < 1000; i++) {
        //     int score = input.nextInt();
        //     listOf1000Students[i] = score;
        // }
        // input.close();

        // int[] intLenOFive = new int[5];

        // String[] arrStringOLen70 = new String[70];

        // int[] arr = new int[]{4, 5, 7, 11, 18};

        // char[] text = new char[7];
        // text[0] = 'A';
        // text[1] = 'e';
        // text[2] = 'S';
        // text[3] = 'P';
        // text[4] = 'a';
        // text[5] = 'K';
        // text[6] = 't';

        // short[] score = new short[]{-3, 6, -8, 9, -11, 12, -2};
        long[] score = new long[]{-3, 6, -8, 9, -11, 12, -2};
        // long[] score = new long[7];
        // long[0] = -3;
        // long[1] = 6;
        // long[2] = -8;
        // long[3] = 9;
        // long[4] = -11;
        // long[5] = 12;
        // long[6] = -2;

        score[0] = 10;
        // System.out.println(score[score.length - 1]);
        // System.out.println(score.length);
        // for(int i = 0; i < score.length; i++) {
        //     score[i] = -1;
        // }

        // int sum = 0;
        // for(int i = 0; i < score.length; i++) {
        //     sum += score[i];
        // }
        // System.out.println(sum);

        // for(int i = 0; i < score.length; i++) {
        //     System.out.println("Student" + (i + 1) + ": " + score[i]);
        // }

        // boolean[] b = new boolean[3];
        // double[] v = new double[100];
        // char[] c = new char[9];
        // int[] d = {3, 4, 5, 6, 7, 8, 9, 10};

        // System.out.println(d.length);
        // System.out.println(b[0]);
        // System.out.println(c.length);
        // System.out.println(c[3]);
        // System.out.println(d[8]);
        // System.out.println(v[5]);

        char[] copyFrom = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        char[] copyTo = new char[4];

        System.arraycopy(copyFrom, 2, copyTo, 0, 4);
        System.out.println(new String(copyTo));

        String[] text = {"William", "Beatrice", "Lucy", "Sam"};
        for (String t : text) {
            System.out.println(t);
        }
    }
}