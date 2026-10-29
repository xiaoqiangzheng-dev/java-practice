public class Example05 {
    public static void main(String[] args) {
        int a = 1;
        ++a;
        System.out.println("a=" + a);
        int b = 1;
        b++;
        System.out.println("b=" + b);
        int c = 10;
        int d = c++;
        int e = ++c;
        System.out.println("d=" + d);
        System.out.println("e=" + e);
    }
}
