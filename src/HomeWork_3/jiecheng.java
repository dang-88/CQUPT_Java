package HomeWork_3;//【问题描述】
//    使用do-while语句编写一个Java程序，在屏幕上输出1 + 2! + 3! + …… + n!的和
//
//
//        【输入形式】
//
//        Please input the value of n:
//        输入阶乘项最后一个数n的值
//
//
//        【输出形式】
//        输出1 + 2! + 3! + …… + n!的和


import java.util.Scanner;

public class jiecheng {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input a number:");
        int n = in.nextInt();
        int i = 1, a = 1, b = 0, c = n;
        do {
            do {
                a = a * i;
                i++;
            } while (i <= c);
            b = b + a;
            c--;
            a = 1;
            i = 1;
        } while (c != 0);
        System.out.println(b);
    }
}
