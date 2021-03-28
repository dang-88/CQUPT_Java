package HomeWork_3;
//问题描述】
//        从键盘输入一行英文字符串，只统计字符串中出现的每个英文字母的个数。大小写字母算相同的字符，不做区分，例如a和A，算相同字符。
//
//        【输入形式】
//        输入一行英文字符串。
//
//        【输出形式】
//        以合适的形式输出每个英文字母出现的次数，没有出现的字母，不输出次数。

import java.util.Arrays;
import java.util.Scanner;

public class strShiftLetter_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str =str1.toUpperCase();
        System.out.printf(str1);
        char [] charNum = new char[str.length()];
        for (int i=0;i<str.length();i++){
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' ){
                charNum[i]=str.charAt(i);
            }
        }
        Arrays.sort(charNum);
        System.out.println(charNum);
    }
}
























//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
////import com.google.common.collect.Maps;
//
//public class strShiftLetter {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String str1 = in.nextLine();
//        String str =str1.toUpperCase();
//        HashMap<String, Integer> map = new HashMap<String, Integer>();
//        //String str = "afashfjgjkhlnmash,^566*整数gshkjshgksdfsgdfhjk";
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            String key = String.valueOf(c);
//            if (map.containsKey(key)) {
//                Integer value = map.get(key);
//                map.put(key, value + 1);
//            } else {
//                //map.put(key, 1); 统计所有的字符，包括中文
//                if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {//利用ascii码去除字符串的数字，空格，标点符号，特殊字符
//                    map.put(key, 1);
//                }
//            }
//        }
////        sortByKey(map, false);
//        System.out.println(map);
//    }
//}