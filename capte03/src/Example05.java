class Car {
    private String brand;
    private String model;
    private String engine;
    public Car(){
        System.out.println("调用无参数构造方法，无法为属性赋初始值");
    }
    public Car(String brand,String model,String engine){
        System.out.println("调用有参数构造方法，成功为属性赋初始值");
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }
    public void print(){
        System.out.println("该汽车的品牌为" + brand);
        System.out.println("该汽车的型号为" + model);
        System.out.println("该汽车的发动机为" + engine);
    }
}
public class Example05 {
    public static void main(String[]args){
        Car car1 = new Car();
        car1.print();
        Car car2 = new Car("奥迪","A6","V6涡轮增压发动机");
        car2.print();
    }
}
