public class Example27 {
    public static void main(String[] args){
        double result2 = add(3.14,2.46);
        System.out.println("Result 1: " + result2);
        int result3 = add(4, 6, 8);
        System.out.println("Result 2: " + result3);
        double result4 = add(7, 4.5);
        System.out.println("Result 3: " + result4);
    }
    public static double add(double a, double b){
        return a + b;
    }
    public static int add(int a, int b, int c){
        return a + b + c;
    }
    public static double add(int a, double b){
        return a + b;
    }
}
