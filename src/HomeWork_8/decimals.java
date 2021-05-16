package HomeWork_8;

import java.util.Scanner;

public class decimals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        int i = (int) n, k = 1;
        float j = (float) (n - i) % 10;
//        k = (int)j%1;
        String s = String.valueOf(j);
        System.out.println(s.length());
        System.out.println(j);
        for (int a = 2; a < s.length(); a++) {
            k = k * 10;
        }
        System.out.println(k);
    }
}
