public class Fibonacci {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int n = 20;
        System.out.println("斐波那契数列的前20项为：");
        System.out.print(first + " " + second + " ");
        for (int i = 3; i<= n; i++){
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}
