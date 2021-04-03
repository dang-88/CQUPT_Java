
package shiyan_1;
import java.util.Scanner;

public class Hello {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = in.nextLine();              //输入名字
        System.out.println("hello," + name + "!"); //输出名字
    }
}
