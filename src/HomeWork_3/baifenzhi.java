package HomeWork_3;

import java.util.Scanner;

public class baifenzhi {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("请输入一个成绩：");
        int n = in.nextInt();
        if (n>=90){
            System.out.println("A");
        }else if(n>=80){
            System.out.println("B");
        }else if (n>=70){
            System.out.println("C");
        }else if (n>=60){
            System.out.println("D");
        }else {
            System.out.println("E");
        }
    }
}
