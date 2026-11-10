import java.util.Random;
import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int target = random.nextInt(100) + 1;
        System.out.println("猜数字游戏开始...（目标数字范围是1~100之间的整数）");
        Scanner scanner = new Scanner(System.in);
        int guess;
        while (true) {
            System.out.print("请输入你的猜测：");
            guess = scanner.nextInt();
            if (guess > target) {
                System.out.println("太大了！");
            } else if (guess < target) {
                System.out.println("太小了！");
            } else {
                System.out.println("恭喜你，猜对了！");
                break;
            }
        }
    }
}
