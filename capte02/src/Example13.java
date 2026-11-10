import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long password = 123456;
        long input;
        do {
            System.out.println("请输入您的取款密码:");
            input = scanner.nextLong();
        } while (input != password);
        System.out.println("密码正确，你可以进行取款！");
    }
}
