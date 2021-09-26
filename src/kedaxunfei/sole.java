package kedaxunfei;

import java.util.Scanner;

public class sole {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int num[] = new int[T];
        int min;
        for (int i = 0 ; i<T;i++){
            num[i] = in.nextInt();
        }
        for (int i = 0;i<T;i++){
            min = find(num[i]);
            System.out.println(min);
        }
    }
    public static int find(int num){
        int temp = num+1;
        int temp2 = num+temp;
        return temp2*temp;
    }
}
