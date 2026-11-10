public class Example16 {
    public static void main(String[] args) {
        int i = 1;
        while (true){
            if (i % 12 == 0 && i % 18 == 0 ){
                System.out.println("12和18的最小公倍数为" + i);
                break;
            }
            i++;
        }
    }
}
