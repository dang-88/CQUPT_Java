package HomeWork_3;

import java.util.Scanner;

public class AllSushu {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        double n = in.nextInt();
        while (n!=0) {
            if (panduan(n)){
                System.out.println(n + " is sushu");
            }
            n = in.nextInt();
        }
        System.out.println("programe is over.");
    }
    public static boolean panduan(double n){
        int i;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println(n + " is not sushu");
                return false;
            }
        }
        return true;
    }
}
