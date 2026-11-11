public class Example26 {
    public static void main(String[] args){
        getMax(10,20);
        getMax1();
        int maxNum = getMax2(10,20);
        System.out.println("两个数的较大值为" +  maxNum);
    }
    public static void getMax(int a, int b){
        if (a > b){
            System.out.println("两个数的较大值为" + a);
        }else {
            System.out.println("两个数的较大值为" + b);
        }
    }
    public static void getMax1(){
        int a = 10;
        int b = 20;
        if (a > b){
            System.out.println("两个数的较大值为" + a);
        }else {
            System.out.println("两个数的较大值为" + b);
        }
    }
    public static int getMax2(int a, int b){
        if(a > b){
            return  a;
        }else {
            return b;
        }
    }
}
