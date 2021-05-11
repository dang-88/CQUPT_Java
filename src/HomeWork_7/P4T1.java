package HomeWork_7;

import java.util.Scanner;

class Parents {
    private String name;
    private int age;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void getInfo() {
        System.out.println("my  name  is:  " + getName());
        System.out.println("my  age  is:  " + getAge());
        System.out.println("my  sex  is:  " + getSex());
    }
}

class Father extends Parents {
    public Father() {
        super();
    }

    public void message() {
        System.out.println("I am the father.");
    }
}

class Mother extends Parents {
    public Mother() {
        super();
    }

    public void message() {
        System.out.println("I am the mother.");
    }
}


public class P4T1 {
    public static void main(String[] args) {

        Father f = new Father();
        Mother m = new Mother();

        String name;
        int age;

        Scanner s = new Scanner(System.in);

        System.out.println("Please  input  your  father's  name:");
        f.setName(s.nextLine());
        System.out.println("Please  input  your  mother's  name:");
        m.setName(s.nextLine());

        System.out.println("Please  input  your  father's  age:");
        f.setAge(s.nextInt());
        System.out.println("Please  input  your  mother's  age:");
        m.setAge(s.nextInt());

        f.setSex("M");
        f.message();
        f.getInfo();

        m.setSex("F");
        m.message();
        m.getInfo();
    }
}
