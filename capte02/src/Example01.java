public class Example01 {
    public static void main(String[] args) {
        int productId = 1001;
        String productName = "手机";
        double price = 2999.99;
        boolean isAvailable = true;
        char category = 'E';
        short inventory = 500;
        if (inventory > 100){
            System.out.println("库存充足");
        }else {
            System.out.println("库存紧张");
        }
        long quantity = 1234567890123L;
        float discount = 0.8f;
        byte life = 10;
        double amount = (price*quantity);
        System.out.println("商品编号：" + productId);
        System.out.println("商品名称：" + productName);
        System.out.println("商品价格：" + price);
        System.out.println("是否可用：" + isAvailable);
        System.out.println("商品分类：" + category);
        System.out.println("库存数量：" + inventory);
        System.out.println("已售数量：" + quantity);
        System.out.println("商品折扣：" + discount * 100 + "%");
        System.out.println("使用寿命：" + life);
        System.out.println("商品总金额"+amount);
    }
}
