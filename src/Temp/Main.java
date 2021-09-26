package Temp;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String str1 = in.nextLine();
            String str2 = in.nextLine();
            // 翻转字符串，以便从个位开始计算
            str1 = new StringBuilder(str1.trim()).reverse().toString(); // 系统输入有坑，需要添加trim() 去空格
            str2 = new StringBuilder(str2.trim()).reverse().toString();
            // 利用数学中的常用加法算法
            int index = 0; // 当前处理位所在下标，从个位开始
            int pre = 0; // 前一位的进位
            StringBuilder result = new StringBuilder();
            while (index < str1.length() && index < str2.length()) {
                int sum = Integer.parseInt(str1.charAt(index) + "") +
                        Integer.parseInt(str2.charAt(index) + ""); // 获得同位相加值
                sum += pre; // 与前一位的进位相加
                result.append(sum % 10); // 取得同位相加进位后的值
                pre = sum / 10; // 获取进位值
                index++; // 下标向下一位移动
            }
            // 跳出循环说明index 已经超过了其中一个字符串的长度，只用处理一个字符串即可
            while (index < str1.length()) {
                int sum = Integer.parseInt(str1.charAt(index) + "");
                sum += pre;
                result.append(sum % 10); // 取得同位相加进位后的值
                pre = sum / 10; // 获取进位值
                index++;
            }

            while (index < str2.length()) {
                int sum = Integer.parseInt(str2.charAt(index) + "");
                sum += pre;
                result.append(sum % 10); // 取得同位相加进位后的值
                pre = sum / 10; // 获取进位值
                index++;
            }
            if (pre != 0) { // 最后可能进位1，最大位要放入1
                result.append(pre);
            }
            System.out.println(result.reverse().toString()); // 从个位计算的（个位在最前面），所以翻转字符串即可
        }
    }
}

