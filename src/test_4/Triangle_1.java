package test_4;

import java.util.Scanner;

public class Triangle_1 {
    private double a, b, c;

    Triangle_1(double x, double y, double z) {
        if ((x + y) <= z || (x + z) <= y || (y + z) <= x) {
            this.a = this.b = this.c = 0;
        } else {
            this.a = x;
            this.b = y;
            this.c = z;
        }
    }

    // 没有上面这个会输出a,b,c 如下commm.Triangle4@74a14482
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
        Triangle_1 t = new Triangle_1(x, y, z);
//构造方法通过new运算符调用,需要将x y z变量加进去
        System.out.println("perimeter=" + t.getPerimeter());
        System.out.println("area=" + t.getArea());
        System.out.println(t);
        t.setSide(t.getA() + 3, t.getB() + 2, t.getC() + 1);
        System.out.println(t);
        t.setA(t.getA() + 20);
        System.out.println(t);
        t.setB(t.getB() + 20);
        System.out.println(t);
        t.setC(t.getC() + 20);
        System.out.println(t);
        in.close();
    }

    void setSide(double x, double y, double z) {
        if ((x + y) <= z || (x + z) <= y || (y + z) <= x) {
            this.a = this.b = this.c = 0;
        } else {
            this.a = x;
            this.b = y;
            this.c = z;
        }
    }

    double getA() {
        return this.a;
    }

    void setA(double x) {
        if ((x + this.b) <= this.c || (x + this.c) <= this.b || (this.b + this.c) <= x)
            System.out.println("a input error");
        else
            this.a = x;
    }

    double getB() {
        return this.b;
    }

    void setB(double y) {
        if ((this.a + y) <= this.c || (this.a + this.c) <= y || (y + this.c) <= this.a)
            System.out.println("b input error");
        else
            this.b = y;
    }

    double getC() {
        return this.c;
    }

    void setC(double z) {
        if ((this.a + this.b) <= z || (this.a + z) <= this.b || (this.b + z) <= this.a)
            System.out.println("c input error");
        else
            this.c = z;
    }

    double getPerimeter() {
        return this.a + this.b + this.c;
    }

    double getArea() {
        double p = (this.a + this.b + this.c) / 2;
        double sArea = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return sArea;
    }

    public String toString() {
        return "a=" + this.a + ",b=" + this.b + ",c=" + this.c;
    }
}
