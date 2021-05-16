package Test_5;

import java.util.Scanner;

interface CircleInterface {
    final float PI = 3.14159f;

    float getArea(float r);

    float getCircumference(float r);
}

class Circle implements CircleInterface {
    @Override
    public float getArea(float r) {
        return r * r * PI;
    }

    @Override
    public float getCircumference(float r) {
        return 2 * r * PI;
    }
}

public class P4T2 {
    public static void main(String[] args) {

        Circle c = new Circle();

        Scanner s = new Scanner(System.in);
        System.out.println("Please  input  r:  ");
        float r = s.nextFloat();
        System.out.println("The  area  is  :  " + c.getArea(r));
        System.out.println("The  circumference  is  :  " + c.getCircumference(r));
    }
}
