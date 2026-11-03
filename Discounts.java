import java.util.Scanner;
public class Discounts {
    public static void main(String[] args){
        double shoppingAmount;
        double payableAmount;
        String discountInfo;
        System.out.println("本商场今日搞促销活动，不同购物金额对应的折扣如下：");
        System.out.println("购物金额不超过100元，无优惠。");
        System.out.println("购物金额超过100元，不超过200元，打九折。");
        System.out.println("购物金额超过200元，不超过300元，打八折。");
        System.out.println("购物金额超过300元，打七折。");
        System.out.println("-----------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的购物金额(￥)：");
        shoppingAmount = scanner.nextDouble();
        if (shoppingAmount <= 100){
            payableAmount = shoppingAmount;
            discountInfo = "无优惠";
        } else if (shoppingAmount <= 200){
            payableAmount = shoppingAmount * 0.9;
            discountInfo = "打九折";
        } else if (shoppingAmount <= 300){
            payableAmount = shoppingAmount * 0.8;
            discountInfo = "打八折";
        } else {
            payableAmount = shoppingAmount * 0.7;
            discountInfo = "打七折";
        }
        System.out.println("您的购物金额为：" + shoppingAmount + "元");
        System.out.println("您的优惠信息为：" + discountInfo);
        System.out.println("您需要支付的金额为：" + payableAmount + "元");
    }
}
