package shiyan_2;

import java.util.Scanner;

public class jiecheng {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        //System.out.println("Please input a number:");
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
        System.out.printf("1!~%d!=%d", n, b);
    }

}
