package qizhong;


import java.util.Scanner;


public class Triangle_2 {
    private double a, b, c;

    public Triangle_2() {
    }

    public Triangle_2(double x, double y, double z) {
        if ((x + y) <= z || (x + z) <= y || (y + z) <= x) {
            this.a = this.b = this.c = 0;
        } else {
            this.a = x;
            this.b = y;
            this.c = z;
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
        Triangle_2 t = new Triangle_2(x, y, z);
        System.out.printf("perimeter=" + String.format("%.1f\n", t.getPerimeter()));
        System.out.printf("area=" + String.format("%.1f\n", t.getArea()));
        System.out.printf("a=" + String.format("%.1f", t.a));
        System.out.printf(",b=" + String.format("%.1f", t.b));
        System.out.printf(",c=" + String.format("%.1f", t.c));
        in.close();
    }

    public void setSide(double x, double y, double z) {
        if ((x + y) <= z || (x + z) <= y || (y + z) <= x) {
            this.a = this.b = this.c = 0;
        } else {
            this.a = x;
            this.b = y;
            this.c = z;
        }
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getPerimeter() {
        return this.a + this.b + this.c;
    }

    public double getArea() {
        double p = (this.a + this.b + this.c) / 2;
        double sArea = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return sArea;
    }
}