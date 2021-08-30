package HomeWork_4;

import java.util.Scanner;

public class DeleteNumber {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int[] S = new int[240];
        char[] S1 = in.nextLine().toCharArray();
        for (int i = 0; i < S1.length; i++) {
            S[i] = S1[i] - '0';                   //由于是字符串，故需要减去'0'来实现数字的实现
        }
        int N = in.nextInt();                     //输入要删除的位数
        int i;
        int length = S1.length;
        for (i = 0; i < length; i++) {
            if (N > 0) {                          //判断要删除的个数是否删除完
                while (S[i] > S[i + 1] && N != 0) {   //判断第一位比后一位大
                    for (int j = i; j < length; j++) {   //位移删数操作
                        S[j] = S[j + 1];
                    }
                    N--;
                    i = 0;
                    length--;
                }
            } else {
                for (int a = 0; a < length; a++) {  //循环打印数组
                    System.out.print(S[a]);
                }
                break;
            }
        }
    }
}
