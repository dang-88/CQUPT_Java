package HomeWork_8;

import java.util.Scanner;

public class decimals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        int i = (int) n, k;                      //整数部分提取
        float j = (float) (n - i) % 10;          //小数部分提取
        String s = String.valueOf(j).substring(2);
        k = Integer.valueOf(s);                  //小数部分转整数,作为分子
        int m = (int) Math.pow(10, s.length());  //分母
        for (int a = k; a > 0; a--) {
            if (k % a == 0 && m % a == 0) {      //找最大公约数
                k = k / a;
                m = m / a;
                System.out.println(i + " " + k + " " + m);
                break;
            }
        }
    }
}
