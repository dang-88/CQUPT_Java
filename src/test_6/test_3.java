package test_6;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    public String name;

    public Student(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

public class test_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Student> array = new ArrayList<Student>();
        System.out.println("How many students?");
        int num = in.nextInt();
        if (num > 0) {
            System.out.println("Please input the names of students:");
            for (int i = 1; i <= num; i++) {
                Student st = new Student(in.next());
                array.add(st);
            }
            System.out.println("All the students bellow:");
            for (int i = 0; i < array.size(); i++) {
                Student s = array.get(i);
                System.out.println(i + 1 + ":" + s);
            }
        } else {
            System.out.println("All the students bellow:");
        }
    }
}
