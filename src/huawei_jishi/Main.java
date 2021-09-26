package huawei_jishi;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Queue<Integer[]> queue = new LinkedList<Integer[]>();
        int k = in.nextInt();  //队列长度
        String temp;
        for (int i = 0; i < k; i++) {
            temp = in.next();
            temp = temp.replace(",", "");
//            System.out.println(temp);
            char num[] = temp.toCharArray();
            Integer n[] = new Integer[2];
            for (int j = 0; j < 2; j++) {
                n[j] = Integer.parseInt(String.valueOf(num[j]));
            }
//            System.out.println(num[0]);
            queue.offer(n);
        }
        int a = in.nextInt();
        if (a < 1 || a > 1000) System.exit(0);
        if (k==1){
//            while (queue.size()>0){
//                Integer w = queue.poll();
//                System.out.println(w);
//            }

        }
    }
}
