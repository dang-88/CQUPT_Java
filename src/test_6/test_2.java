package test_6;

import java.util.Scanner;

class denominator {
    public int denominator(int den) throws NegativeException, ZeroException {
        if (den < 0) {
            throw new NegativeException("The divisor, " + den + ", could not be negative!");
        }
        if (den == 0) {
            throw new ZeroException("The divisor, 0,could not be zero!");
        }
        return den;
    }
}

class NegativeException extends Exception {
    NegativeException(String str) {
        super(str);
        System.out.println(str);
    }
}

class ZeroException extends Exception {
    ZeroException(String str) {
        super(str);
        System.out.println(str);
    }
}

public class test_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input first number: ");
        int first = in.nextInt();
        System.out.println("Please input second number: ");
        int second = in.nextInt();
        denominator d = new denominator();
        try {
            d.denominator(second);
            System.out.println("Divisor is : " + (double) first / second);
            System.out.println("finally!");
        } catch (NegativeException n) {
            System.out.println("finally!");
        } catch (ZeroException z) {
            System.out.println("finally!");
        }
    }
}
