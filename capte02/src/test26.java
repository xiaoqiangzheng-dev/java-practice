public class test26 {
    public static void main(String[] args){
        fangfa1(10,20);
        fangfa2();
        int max = fangfa3(10,20);
        System.out.println("最大值是：" + max);
    }
    public static void fangfa1(int a, int b){
        if (a > b) {
            System.out.println("最大值是：" + a);
        }else{
            System.out.println("最大值是：" + b);
        }
    }
    public static void fangfa2(){
        int a = 10;
        int b = 20;
        if (a > b){
            System.out.println("最大值是：" + a);
        }else{
            System.out.println("最大值是：" + b);
        }
    }
    public static int fangfa3(int a, int b){
        if (a > b){
            return a;
        }else{
            return b;
        }
    }
}
