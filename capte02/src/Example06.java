public class Example06 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int z = 0;
        boolean a, b;
        a = x > 0 & y++ > 1;
        System.out.println("a = " + a);
        System.out.println("y = " + y);
        b = x > 0 && z++ > 1;
        System.out.println("b = " + b);
        System.out.println("z = " + z);
        boolean c, d;
        c = x > 0 | y++ > 0;
        System.out.println("c = " + c);
        System.out.println("y = " + y);
        d = x == 0 || y++ > 2;
        System.out.println("d = " + d);
        System.out.println("y = " + y);
    }
}
