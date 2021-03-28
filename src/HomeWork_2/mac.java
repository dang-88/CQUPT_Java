package HomeWork_2;

import java.util.Scanner;

public class mac {
    public static void main(String arge[]){
        Scanner in= new Scanner(System.in);
        System.out.println("Please input the first number:");
        int first = in.nextInt();
        System.out.println("Please input the second number:");
        int second =in.nextInt();
        System.out.println("Please input the third number:");
        int third = in.nextInt();
        int max;
        max = first > second ? (first>third?first:third) : (second>third ? second:third);
        System.out.println("The maximum number is :"+max);
    }
}
