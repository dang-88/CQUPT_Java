package test_3;

import java.util.Scanner;

public class Complex {
    double realPart;
    double imagPart;

    public Complex(double realPart, double imagPart) {
        this.realPart = realPart;
        this.imagPart = imagPart;
    }

    public static Complex add(Complex complex1, Complex complex2) {
        double realPart = complex1.realPart + complex2.realPart;
        double imagPart = complex1.imagPart + complex2.imagPart;
        return new Complex(realPart, imagPart);
    }

    public static Complex sub(Complex complex1, Complex complex2) {
        double realPart = complex1.realPart - complex2.realPart;
        double imagPart = complex1.imagPart - complex2.imagPart;
        return new Complex(realPart, imagPart);
    }

    public static Complex and(Complex complex1, Complex complex2) {
        double realPart = complex1.realPart * complex2.realPart + complex1.imagPart * complex2.imagPart * (-1);
        double imagPart = complex1.realPart * complex2.imagPart + complex2.realPart * complex1.imagPart;
        return new Complex(realPart, imagPart);
    }

    public static void out(Complex complex1, Complex complex2) {
        System.out.println("ComplexNumber a: " + complex1.realPart + " + " + complex1.imagPart + "i");
        System.out.println("ComplexNumber b: " + complex2.realPart + " + " + complex2.imagPart + "i");
        System.out.println("(a + b) = " + add(complex1, complex2).realPart + " + " + add(complex1, complex2).imagPart + "i");
        System.out.println("(a - b) = " + sub(complex1, complex2).realPart + " + " + sub(complex1, complex2).imagPart + "i");
        System.out.println("(a * b) = " + and(complex1, complex2).realPart + " + " + and(complex1, complex2).imagPart + "i");
    }
}

class result {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input c1:");
        Complex complex1 = new Complex(in.nextDouble(), in.nextDouble());
        System.out.println("input c2:");
        Complex complex2 = new Complex(in.nextDouble(), in.nextDouble());
        Complex.out(complex1, complex2);
    }
}