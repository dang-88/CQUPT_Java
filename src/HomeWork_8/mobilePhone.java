package HomeWork_8;

import java.util.Scanner;

interface PayAble {
    public double pay() throws PayException;
}

public class mobilePhone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        double price = sc.nextDouble();

        double pay2 = 0;

        MPhone phone1 = new MPhone("13899999999", times, price);

        try {
            pay2 = phone1.pay();
        } catch (PayException e) {
            System.out.println("Exception  is" + e);
        }
        System.out.println("Fee=" + pay2);
    }
}

abstract class iPhone {
    private String code;

    public iPhone(String code) {
        this.code = code;
    }

    public abstract void display();
}

class MPhone extends iPhone implements PayAble {
    private int time;
    private double price;

    public MPhone(String code, int time, double price) {
        super(code);
        this.time = time;
        this.price = price;
    }


    public double pay() throws PayException {
        double p;
        p = time * price;
        if (p <= 0) {
            throw new PayException("Fee  is  0!");
        }
        return p;
    }

    public void display() {
    }
}

class PayException extends Exception {
    //    private String str;
//    public PayException(String str){
//        this.str=str;
//    }
    public PayException(String Str) {
        super(Str);
//        return "Exception  isPayException:"+Str;
    }
}


