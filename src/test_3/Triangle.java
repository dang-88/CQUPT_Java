package test_3;

import java.util.Scanner;

public class Triangle {
    private double a, b, c;

    public void setSide(double x, double y, double z) {    //三角形边长赋值
        this.a = x;
        this.b = y;
        this.c = z;
    }

    public Triangle(double x, double y, double z) {      //三角形公共类定义
        if (x + y > z && x - y < z) {                             //三边符合要求便定义赋值
            setSide(x, y, z);
        } else {
            setSide(0, 0, 0);                   //不符合要求赋值为0
        }
        out(a, b, c);
    }

    public static double getPerimeter(double a, double b, double c) {         //计算三角形周长
        //System.out.println(a+" "+b+" "+c+" ");
        return (a + b + c);
    }

    public static double getArea(double a, double b, double c) {
        return ((double) 1 / 4) * Math.sqrt((a + b + c) * (a + b - c) * (a + c - b) * (b + c - a));  //海伦公式：计算三角形面积
    }

    public static void out(double a, double b, double c) {                    //输出函数
        System.out.printf("perimeter=%.1f\n", getPerimeter(a, b, c));
        System.out.printf("area=%.1f\n", getArea(a, b, c));
        System.out.printf("a=%.1f", a);
        System.out.printf(",b=%.1f", b);
        System.out.printf(",c=%.1f\n", c);
    }
}

class jieguo {
    public static void main(String[] args) {                               //主函数运行
        Scanner in = new Scanner(System.in);
        Triangle triangle = new Triangle(in.nextDouble(), in.nextDouble(), in.nextDouble());
    }
}
