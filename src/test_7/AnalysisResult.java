package test_7;

import java.io.*;
import java.util.*;

class Fenxi {
    public static double getTotalScore(String s) {
        Scanner scanner = new Scanner(s);
        scanner.useDelimiter("[^0123456789.]+");
        double totalScore = 0;
        while (scanner.hasNext()) {
            try {
                double score = scanner.nextDouble();
                totalScore = totalScore + score;
            } catch (InputMismatchException exp) {
                String t = scanner.next();
            }
        }
        return totalScore;
    }
}

public class AnalysisResult {
    public static void main(String[] args) {
        File fRead = new File("score.txt");
        File fWriter = new File("scoreAnalysis.txt");
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
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
