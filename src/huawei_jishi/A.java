package huawei_jishi;

import java.util.Scanner;

public class A {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int M,N,n=0,a,b;
        M = in.nextInt();
        N = in.nextInt();
        if (M*N>20) System.exit(0);
        int[][] num = new int[M][N];
        for (int i = 0;i<N;i++){
            for (int j=0;j<M;j++){
                num[i][j]=in.nextInt();
            }
        }
        for (int i = 0;i<N;i++){
            for (int j=0;j<M;j++){
                if (num[i][j]==0){
                    n++;
                }
            }
        }
        if (n>11) System.exit(0);


    }
    int i=0,j=0;
    public void find(int[][] num){
        if (num[i][j]==0){
            ++j;
            find(num);
        }else if (num[i][j]==0){
            ++i;
            find(num);
        }

    }
}
