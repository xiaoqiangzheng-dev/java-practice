public class Example22 {
    public static void main(String[] args) {
        int[] sales = new int[]{10,16,20,8,15,25,13,16,21,9};
                int sum = 0;
        for(int i = 0; i<= sales.length-1; i ++){
            System.out.println("第" + (i+1) + "个员工的销售额为" + sales[i]);
            sum += sales[i];
        }
        System.out.println(("部门销售总额为" + sum));
    }
}
