package shiyan_2;

import javax.script.ScriptContext;
import java.util.Scanner;

public class FenDuanHanShu {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        double x = n, y;
        if (x > 0) {
            y = 1 / Math.exp(x);
        } else if (x < 0) {
            y =0 -Math.exp(x);
        } else {
            y = 1;
        }
        System.out.printf("y=" + String.format("%.4f", y));
    }
}
