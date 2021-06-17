package HomeWork_10;

public class ReadData {
    public static void main(String[] args) throws Exception {
        // 创建一个文件对象
        java.io.File file = new java.io.File("scores.txt");
        // 为文件创建一个Scanner对象
        java.util.Scanner input = new java.util.Scanner(System.in);   //空白处①
        // 从文件读取数据
        while (input.hasNext()) {
            String firstName = input.next();   //空白处②
            String mi = input.next();
            String lastName = input.next();
            int score = input.nextInt();
            System.out.println(firstName + " " + mi + " " + lastName + " " + score);
        }
        input.close();// 空白处③, 关闭输入流
    }
}
