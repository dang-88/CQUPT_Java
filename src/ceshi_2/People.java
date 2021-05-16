package ceshi_2;

import java.util.Scanner;

public class People {
    public String name;
    public int age;

    People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please input name");
        String name = in.nextLine();
        System.out.println("please input age");
        int age = in.nextInt();
        People P = new People(name, age);
        P.show();
    }

    public void show() {
        if (age >= 18 && age <= 60) {
            System.out.println(name + "'s age is: " + age + ", ticket: 20$.");
        } else if (age >= 0 && age < 18 || age > 60) {
            System.out.println(name + "'s age is: " + age + ", ticket: free.");
        } else {
            System.out.println(name + "'s age not be less than 0.");
        }
    }
}
