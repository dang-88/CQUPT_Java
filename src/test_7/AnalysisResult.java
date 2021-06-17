package test_7;

import java.io.*;
import java.util.*;

class Fenxi {
    public static double getTotalScore(String s) {
        String regex = "[^0123456789]";
        String digitMess = s.replaceAll(regex, "*");
        StringTokenizer fenxi = new StringTokenizer(digitMess, "*");
        double totalScore = 0;
        while (fenxi.hasMoreTokens()) {
            double score = Double.parseDouble(fenxi.nextToken());
            totalScore = totalScore + score;
        }
        return totalScore;
    }
}

public class AnalysisResult {
    public static void main(String[] args) {
        File fRead = new File("D:\\yingyong\\IntelliJ IDEA Community Edition 2020.3.2\\IdeaProjects\\src\\test_7\\score.txt");
        File fWriter = new File("D:\\yingyong\\IntelliJ IDEA Community Edition 2020.3.2\\IdeaProjects\\src\\test_7\\scoreAnalysis.txt");
        try {
            Writer out = new FileWriter(fWriter);
            BufferedWriter bufferedWriter = new BufferedWriter(out);
            Reader in = new FileReader(fRead);
            BufferedReader bufferedReader = new BufferedReader(in);
            String str = null;
            while ((str = bufferedReader.readLine()) != null) {
                double totalScore = Fenxi.getTotalScore(str);
                str = str + " zongFen:" + totalScore;
                System.out.println(str);
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
            bufferedReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
