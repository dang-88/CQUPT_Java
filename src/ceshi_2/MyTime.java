package ceshi_2;

import java.util.Scanner;

public class MyTime {
    int w;
    private int hour;
    private int minute;
    private int second;

    MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public static void main(String[] args) {
        int h, m, s;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Input  the  first  time's  hour,  minute  and  second:");
            h = sc.nextInt();
            m = sc.nextInt();
            s = sc.nextInt();
        } while (h > 24 || h < 0 || m < 0 || m > 59 || s < 0 || s > 59);

        MyTime t1 = new MyTime(h, m, s);
        do {
            System.out.println("Input  the  second  time's  hour,  minute  and  second:");
            h = sc.nextInt();
            m = sc.nextInt();
            s = sc.nextInt();
        } while (h > 23 || h < 0 || m < 0 || m > 59 || s < 0 || s > 59);

        MyTime t2 = new MyTime(h, m, s);

        System.out.println("the  time  from  " + t1 + "  after  " + t2 + "  is:  ");
        System.out.println(t1 + "  +  " + t2 + "  =  " + t1.add(t2));
        System.out.println("the  time  between  " + t1 + "  to  " + t2 + "  is:  ");
        if (t1.compare(t2))
            System.out.println(t1 + "  -  " + t2 + "  =  " + t1.sub(t2));
        else
            System.out.println(t2 + "  -  " + t1 + "  =  " + t1.sub(t2));
        sc.close();
    }

    public MyTime add(MyTime other) {
        other.hour = this.hour + other.hour;
        other.minute = this.minute + other.minute;
        other.second = this.second + other.second;
        if (other.hour > 24)
            other.hour = other.hour - 24;
        return other;
    }

    public MyTime sub(MyTime other) {
        if (w == 1) {
            this.hour = this.hour + other.hour;
            this.minute = this.minute + other.minute;
            this.second = this.second + other.second;
        }
        if (w == 0) {
            this.hour = other.hour - this.hour;
            this.minute = other.minute - this.minute;
            this.second = other.second - this.second;
        }
        return this;
    }

    public boolean compare(MyTime other) {
        boolean p = false;
        if (this.hour > other.hour) {
            p = true;
            w = 1;
        } else if (this.hour < other.hour) {
            p = false;
            w = 0;
        }
        if (this.hour == other.hour && this.minute > other.minute) {
            if (this.minute > other.minute) {
                p = true;
                w = 1;
            } else if (this.minute < other.minute) {
                p = false;
                w = 0;
            }
        }
        return p;
    }

    public String toString() {
        return String.format("%1d:%1d:%1d", hour, minute, second);
    }
}
