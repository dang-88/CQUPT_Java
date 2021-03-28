package HomeWork_3;/*
【问题描述】编写一个程序，用户输入若干整数，试找出其中的最大数和最小数。
        【输入形式】用户在第一行待输入数据个数，在第二行输入数据。
        【输出形式】程序在下一行输出数据的最大值和最小值
        【样例输入】
        5
        89 62 96 74 52
        【样例输出】96 52
        【样例说明】用户第一次输入的为数据个数，在下一行依次输入数据。输出为5个数中的最大值和最小值，输出时候两个数之间用空格分隔。
        【评分标准】结果完全正确得20分，每个测试点4分。
*/


//import java.awt.*;
//import java.util.Scanner;
//
//public class maxAndmin {
//    public static void main(String args[]) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt(), i;
//        int[] num = new int [n];
//        for (i=0;i<n;i++){
//            num[i] = in.nextInt();
//        }
//        paixu(num,n);
//        System.out.printf("%d %d",num[n-1],num[0]);
//    }
//    public static void paixu(int num[],int n){
//        int i,j,temp;
//        for (i=0;i<n-1;i++){
//            for (j=1;j<n;j++){
//                if (num[j] < num[j-1]){
//                    temp = num[j];
//                    num[j]=num[j-1];
//                    num[j-1] = temp;
//                }
//            }
//        }
//    }
//}



import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class maxAndmin {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), i;
        int[] num = new int [n];
        for (i=0;i<n;i++){
            num[i] = in.nextInt();
        }
        Arrays.sort(num);
        System.out.printf("%d %d",num[n-1],num[0]);
    }
}