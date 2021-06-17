package HomeWork_10;

class Triangle {

    private double sideA;

    private double sideB;

    private double sideC;

    public Triangle(double a, double b, double c) throws Exception {

        if ((a + b <= c) || (b + c <= a) || (a + c <= b)) {
            throw new Exception("三条边不能构成三角形");
        } else {
            sideA = a;
            sideB = b;
            sideC = c;
        }
    }

    public double getArea() {
        double s = 0;
        double x = (sideA + sideB + sideC) / 2.0;
        s = Math.sqrt(x * (x - sideA) * (x - sideB) * (x - sideC));
        return s;
    }

}

public class Test {
    public static void main(String[] args) {
        double a = 3.0, b = 4.0, c = 5.0;
        try {
            Triangle tri = new Triangle(a, b, c);
            ;  //空白处①
            System.out.println("三角形面积为" + tri.getArea());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
