package HomeWork_5;

import java.util.Scanner;

public class Circle {
    private double radius;

    Circle() {
        this.radius = 0;
    }

    Circle(double r) {
        this.radius = r;
    }

    //圆周长计算方法
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    //圆面积计算方法
    double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    //Circle类内的disp输出方法
    void disp() {
        System.out.printf("radius=%.4f\n", radius);
        System.out.printf("perimeter=%.4f\n", getPerimeter());
        System.out.printf("area=%.4f\n", getArea());
    }
}

//主函数调用
class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Circle circle = new Circle(in.nextDouble());
        circle.disp();    //调用Circle类的disp方法输出
    }
}

