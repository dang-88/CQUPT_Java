package xiaomi;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] num =new int[10];
        for (int i=0;i<10;i++){
            num[i] = in.nextInt();
        }
        Arrays.sort(num);
        for (int i = 0;i<10;i++){
            System.out.print(num[i]+" ");
        }
    }
}
