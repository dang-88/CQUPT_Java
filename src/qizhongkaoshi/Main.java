package qizhongkaoshi;

public class Main {
    public static void main(String[] args) {
        char ch = '8';
        int r = 10;
        switch (ch + 1) {
            case '7':
                r = r + 3;
            case '8':
                r = r + 5;
            case '9':
                r = r + 6;
                break;
            default:
                r = r + 8;
        }

        System.out.println(r);
        System.out.println(r);
    }
}