package test_6;

import java.util.Scanner;

class coreerror {
    public int coreerror(int num) throws MyException {
        int a = num;
        if (num > 100 || num < 0) {
            throw new MyException("Error,score should be in 0-100.");
        }
        return a;
    }
}

class MyException extends Exception {
    MyException(String msg) {
        super(msg);
        System.out.println("Error,score should be in 0-100.");
    }
}

public class test {
    public static void main(String[] args) {
        System.out.println("Please input your score");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
//        int a;
        coreerror d = new coreerror();
        try {
            int s = d.coreerror(num);
            System.out.println("Your score is:" + s);
        } catch (MyException e) {
//            System.out.println("Error,score should be in 0-100.");
        }
    }
}