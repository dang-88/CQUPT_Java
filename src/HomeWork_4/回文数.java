package HomeWork_4;

import HomeWork_2.sushu;

import java.util.Scanner;

public class 回文数 extends DeleteNumber {
    public static void main(String arge[]) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        sushu shu = new sushu();
        for (int i = a; i <= b; i++) {
            c = shu.changer(i);
            if (c==i){
                System.out.println(c);
            }
        }
    }
}
