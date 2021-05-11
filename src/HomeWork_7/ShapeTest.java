package HomeWork_7;


abstract class Shape {
    abstract double perimeter();
}

class Circle extends Shape {
    private double r;

    public Circle(double r) {
        this.r = r;       //空白①
    }

    double perimeter() {
        return Math.PI * 2 * r;         //空白②
    }
}

class Rectangle extends Shape {
    private double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double perimeter() {
        return 2 * (a + b);    //空白③
    }
}

public class ShapeTest {
    public static void main(String[] args) { //测试代码
        Circle c = new Circle(5);
        Rectangle rect = new Rectangle(2, 3);
        System.out.println(c.perimeter()); //输出圆的周长
        System.out.println(rect.perimeter());  //输出矩形的周长
    }
}