package HomeWork_3;

import java.util.Arrays;
import java.util.Scanner;

public class strShiftLetter_2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str = str1.toUpperCase();
        String str2;
        int a = 0, b = 0, c = 0, j = 0;
        char[] charNum = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                charNum[c] = str.charAt(i);
                c++;
            }
        }
        char[] charNum2 = new char[c];
        for (int i = 0; i < c; i++) {
            charNum2[i] = charNum[i];
        }
        Arrays.sort(charNum2);
        str2 = String.valueOf(charNum2);
        for (int i = 0; i < c; i++) {
            b = (str2.lastIndexOf(str2.charAt(i)) - str2.indexOf(str2.charAt(i))) + 1;
            i = str2.lastIndexOf(str2.charAt(i));
            System.out.println("(" + str2.charAt(i) + ")Num=" + b);
        }
    }
}
