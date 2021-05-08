package test_4;

import java.util.Scanner;

public class Student {
    private String name, id;
    private int score;

    Student(String name, String id, int score) {
        this.name = name;
        this.id = id;
        this.score = score;
        if (score < 0 || score > 100) {
            this.score = 0;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n, s;
        int sc;
        n = in.nextLine();
        s = in.nextLine();
        sc = in.nextInt();
        Student stu = new Student(n, s, sc);
        System.out.println(stu);
        stu.setScore(sc + 50);
        System.out.println(stu);
    }

    void setScore(int score) {
        if (score < 0 || score > 100) {

            System.out.println("score input error");
        }
    }

    //    	这个函数能主动调用 toString 库函数，用toString函数产生的字符串来输出要输出的东西.
    public String toString() {
        return "name=" + name + ",id=" + id + ",score=" + score;
    }
}
