package HomeWork_2;

import java.util.Scanner;

public class average {
    public static void main(String arge[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        average(a, b, c);
    }

    public static double sum(int a, int b, int c) {
        System.out.printf("sum=%.1f%n", (float) a + b + c);
        return a + b + c;
    }

    public static void average(int a, int b, int c) {
        double n = sum(a, b, c) / 3.0;
        System.out.println("average=" + n);
    }
}
