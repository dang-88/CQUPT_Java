package HomeWord_9;

import java.util.ArrayList;
import java.util.Scanner;

interface Comarable {
    Book compareTo(Book SB, Book NB);    //定义接口方法
}

class Book implements Comarable {
    public String name;
    public double price;

    Book() {                  //无参构造方法
    }

    Book(String name, double price) {  //有参构造方法
        this.name = name;
        this.price = price;
    }

    public Book compareTo(Book SB, Book NB) {   //接口对比方法实例化
        if (SB.price != NB.price) {
            return null;
        }
        return NB; 
    }
}

public class bookss {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input several Book,in the end #");
        ArrayList<Book> books = new ArrayList<Book>();       //定义Array列表，存放Book类的对象
        for (String str = retin(in); !str.equals("#"); str = retin(in)) {   //对输入对象判断，循环输入，“#”退出
            String[] s = str.split("\\,");                     //字符串分割，以“,”为分割标志
            Book book = new Book(s[0], Double.valueOf(s[1]));        //创建Book类对象，进行传参
            books.add(book);                                         //对象添加到列表
        }
        System.out.println("input a new Book:");
        String ss = in.nextLine();
        String[] s = ss.split("\\,");
        Book Nbook = new Book(s[0], Double.valueOf(s[1]));
        Book book = new Book();
        System.out.println("new book:<" + Nbook.name + ">as same books");
        for (int a = 0; a < books.size(); a++) {
            if (book.compareTo(books.get(a), Nbook) == Nbook) {      //调用比较的接口方法进行对象比较
                System.out.println(books.get(a).name + "," + books.get(a).price);
            }
        }
    }

    public static String retin(Scanner in) {
        String str = in.nextLine();
        return str;
    }
}