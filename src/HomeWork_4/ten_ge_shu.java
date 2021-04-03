
//        【问题描述】
//        从键盘输入10个整数，存放在一个数组中，然后使数组中的所有整数整体向后移动m个位置，最后m个数变成最前面的m个数，并输出移动后的结果。m从键盘输入。
//
//
//        【输入形式】
//        输入10个整数，每个整数间用空格分隔，回车。然后输入整数m。
//
//
//        【输出形式】
//        首先输出数组中的10个元素，然后输出后移m位以后的数组所有元素。

package HomeWork_4;

import java.util.Scanner;

public class ten_ge_shu extends findallLetter {
    public static void main(String args[]) {
        System.out.println("Please input 10 numbers:");
        Scanner in = new Scanner(System.in);
        int[] num = new int[10];
        int i = 0, a,b=0;
        for (i = 0; i < 10; i++) {
            num[i] = in.nextInt();
        }
        System.out.println("Your numbers are:");
        for (i = 0; i < 10; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println("\nPlease input m:");
        int m = in.nextInt();
        int[] num1 = new int[10];
        a = 10 - m;
        for (i = 0; i < 10; i++) {
            if (a<10){
                num1[i] = num[a];
                a++;
            }else {
                num1[i]=num[b];
                b++;
            }
        }
        System.out.println("The new numbers are:");
        for (i = 0; i < 10; i++) {
            System.out.print(num1[i] + " ");
        }
    }
}
