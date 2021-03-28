package HomeWork_2;


import java.util.Scanner;


public class sushu {
    public static void main(String[] arge) {
        Scanner in = new Scanner(System.in);
        int PrimeNum = in.nextInt();
        decide(PrimeNum);
        decide(changer(PrimeNum));
        System.out.println("yes");
    }

    public static int changer(int PrimeNum) {
        int b = 0, c = PrimeNum;
        while ((c / 10 > 0) || (c / 1 > 0)) {
            b = b * 10 + c % 10;
            c = c / 10;
        }
        return b;
    }

    public static void decide(int b) {
        for (int i = 2; i < b; i++) {
            if (b % i == 0) {
                System.out.println("no");
                System.exit(0);
            }
        }
    }
}
