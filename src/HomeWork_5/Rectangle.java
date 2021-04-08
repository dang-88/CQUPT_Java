package HomeWork_5;

import java.util.Scanner;

public class Rectangle {
    double length, width;

    //Rectangle类对象的构造方法建立（带参数）
    public Rectangle(double Length, double Width) {
        length = Length;
        width = Width;
        //类内调用输出方法
        //printf(length,width);
    }

    //长方形计算面积的方法
    public static double area(double length, double width) {
        return length * width;
    }

    //输出方法
    public static void printf(double length, double width) {
        System.out.println("The lengh is:" + length);
        System.out.println("The width is:" + width);
        System.out.println("The area is:" + area(length, width));
    }
}

class result {
    //主函数调用
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double length, windth;
        System.out.println("Please input length: ");
        length = in.nextDouble();
        System.out.println("Please input width: ");
        windth = in.nextDouble();
        //直接从类外调用Rectangle类的输出方法
        Rectangle.printf(length, windth);
        //从类里面调用输出方法
        //Rectangle rectangle = new Rectangle(length,windth);
    }
}
