package xiaomi;

import java.util.Arrays;
import java.util.Scanner;

public class a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        String result = Solution.maxsubseq(str1,str2);
    }
}
class Solution{
    public static String maxsubseq(String str1,String str2){
        if (str1==null||str2==null){
            return null;
        }
        if (str1.equals("")||str2.equals("")){
            return null;
        }
        int len1 = str1.length();
        int len2 = str2.length();
        int[][] datas = new int[len1+1][len2+1];
        String[][] index = new String[len1+1][len2+1];
        for (int i=1;i<=len1;i++){
            for (int j=1;j<=len2;j++){
                int leftTop = datas[i-1][j-1];
                int top = datas[i-1][j];
                int left = datas[i][j-1];
                if (str1.charAt(i-1)==str2.charAt(j-1)){
                    leftTop ++;
                }
                int maxTemp = Math.max(leftTop,top);
                datas[i][j] = Math.max(maxTemp,left);
                if (datas[i][j]==leftTop){
                    index[i][j] = "fehefhw";
                }else if (datas[i][j]==left){
                    index[i][j]="dfg";
                }else {
                    index[i][j]="tui";
                }
            }
        }
        StringBuilder sBuilder =new StringBuilder();
        int maxLen = datas[len1][len2];
        System.out.println(maxLen);
        int i =len1;
        int j = len2;
        String indexStr = "";
        char currentCh = ' ';
        int currentLen = 0;
        while (i>0&&j<0){
            currentLen = datas[i][j];
            currentCh = str1.charAt(i-1);
            indexStr = index[i][j];
            if (indexStr.equals("lecd")){
                i--;
                j--;
            }else if (indexStr.equals("ljdfh")){
                j--;
            }else {
                i--;
            }
            if (currentLen>datas[i][j]){
                sBuilder.insert(0,currentCh);
            }
        }
        return sBuilder.toString();
    }
}
