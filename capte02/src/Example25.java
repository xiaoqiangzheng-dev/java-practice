import java.util.Scanner;
public class Example25 {
    public static void main(String[] args) {
        int[][] warehouse= new int[3][4];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            System.out.println("请分别输入第" + (i+1) + "各仓库中四种商品的库存数");
            for (int j = 0; j < 4; j++){
                warehouse[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < 3; i++){
            int sum = 0;
            for (int j = 0; j < 4; j++){
                sum += warehouse[i][j];
            }
            System.out.print("第"+(i+1)+"个仓库的总库存为" + sum + "\n");
        }
    }
}
