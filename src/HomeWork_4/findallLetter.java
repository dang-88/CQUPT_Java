package HomeWork_4;

//import java.util.Arrays;
import java.util.Scanner;

public class findallLetter extends 回文数 {
    public static void main(String arggs[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input a sentence:");
        String str = in.nextLine();
        int i=0,a=0,b=0,c=0,d=0;
        for (i=0;i<str.length();i++){
            if ((str.charAt(i)>='a'&&str.charAt(i)<='z')||(str.charAt(i)>='A'&&str.charAt(i)<='Z')){
                a++;
                continue;
            }else if (str.charAt(i)>='0'&&str.charAt(i)<='9'){
                b++;
                continue;
            }else if (str.charAt(i)==' '){
                c++;
                continue;
            }else {
                d++;
                continue;
            }
        }
        System.out.println("The number of numbers is: "+b);
        System.out.println("The number of English letters is: "+a);
        System.out.println("The number of blank space is: "+c);
        System.out.println("The number of other characters is: "+d);
    }
}
