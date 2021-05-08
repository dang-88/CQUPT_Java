package qizhongkaoshi;

import java.util.Scanner;

public class fibonacci {
    //    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        //int[] f ;
//        if (n>0){
//            int[] fib = new int[n];
//            fib[0]=1;
//            fib[1]=1;
//            fib = fibon(n,fib);
//        }
//        for (int i=0;i<n;i++){
//            System.out.println();
//        }
//
//    }
//    public static int[] fibon(int n,int[] fib){
//        for (int i=0;i<n;i++){
//            fib[i+2]=fib[i]+fib[i+1];
//        }
//        int[] fi=fib;
//        return fi;
//    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] fib = new int[n];
        for (int counter = 0; counter <= n; counter++) {
            fib[counter] = fibonacci(counter);
            System.out.printf("Fibonacci of %d is: %d\n", counter, fibonacci(counter));
        }
    }

    public static int fibonacci(int number) {
        if ((number == 0) || (number == 1))
            return number;
        else
            return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
