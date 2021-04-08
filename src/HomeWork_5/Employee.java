package HomeWork_5;

import java.util.Scanner;

public class Employee {
    private String name;
    private int age;
    private float sarary, bonus;

    //Employee类的带参构造方法；
    Employee(String name, int age, float sarary, float bonus) {
        this.name = name;
        this.age = age;
        this.sarary = sarary;
        this.bonus = bonus;
    }

    //计算总收入方法
    float income() {
        return sarary + bonus;
    }

    //输出方法
    void print() {
        System.out.println("Employee's name: " + name);
        System.out.println("Employee's age: " + age);
        System.out.println("Employee's income: " + income());
    }
}

//主函数程序调用
class main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input the employee's name: ");
        String name = in.nextLine();
        System.out.println("Please input the employee's age: ");
        int age = in.nextInt();
        System.out.println("Please input the employee's sarary: ");
        float sarary = in.nextFloat();
        System.out.println("Please input the employee's bonus: ");
        float bonus = in.nextFloat();
        Employee employee = new Employee(name, age, sarary, bonus);
        employee.print();
    }
}