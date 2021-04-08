package HomeWork_5;

import java.util.Scanner;

public class MyPoint {
    private float horizontal, ordinate;

    //构造方法
    MyPoint(float x, float y) {
        this.horizontal = x;
        this.ordinate = y;
    }

    //输出
    void print() {
        System.out.println("Your location of horizontal (X) is : " + horizontal);
        System.out.println("Your location of ordinate (Y) is : " + ordinate);
    }
}

class point {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input the horizontal (X) : ");
        float X = in.nextFloat();
        System.out.println("Please input the ordinate (Y) : ");
        float Y = in.nextFloat();
        MyPoint point = new MyPoint(X, Y);
        point.print();
    }
}