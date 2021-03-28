package shiyan_1;

import java.util.Scanner;

public class leapYear {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        if (year%4==0 || year%400==0 ){
            System.out.println(year+" is leap year");
        }else {
            System.out.println(year+" is not leap year");
        }
    }
}
