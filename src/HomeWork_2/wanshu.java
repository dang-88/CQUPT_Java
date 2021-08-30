package HomeWork_2;

import java.util.Scanner;

public class wanshu {
    public static void wanshu(int min, int max) {     //减法计算完数
        for (int a = min; a <= max; a++) {
            int s = a;
            for (int i = 1; i < a; i++) {
                if (a % i == 0) {
                    s = s - i;
                }
            }
            if (s == 0) {
                System.out.printf("%d,", a);
            }
        }
    }

    public static void main(String arge[]) {
        Scanner in = new Scanner(System.in);
        int min = in.nextInt(), max = in.nextInt();
        System.out.println(min + " to " + max + " WanShu:");
        wanshu(min, max);
    }
}
/*
第二种方式：加法方式
public class PerfectNumber {
    public static void PerfectN(){
    	for(int a=2;a<=1000;a++){
    		int s=0;
    		for(int i=1;i<a;i++){
    			if(a%i==0){
    				s+=i;
    			}
    		}
    		if(s==a){
        		System.out.println("输出完数："+a);
        	}
    	}
    }
	public static void main(String[] args){
		PerfectN();
   }
}

第三种方式：递归法

public class PerfectNumber {
    public static void PerfectN(int a){
    	   if(a>1000){
    		  return;
    	   }
    		int s=0;
    		for(int i=1;i<a;i++){
    			if(a%i==0){
    				s+=i;
    			}
    		}
    		if(s==a){
        		System.out.println("输出完数："+a);
        	}
    		PerfectN(a+1);
    	}
	public static void main(String[] args){
		PerfectN(2);
   }
}



 */