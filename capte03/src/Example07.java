class User {
    private String name;
    private int age;
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void print(){
        String name = "李四";
        int age = 20;
        System.out.println("访问成员变量name和age：name = " + this.name + ", age = " + this.age);
        System.out.println("访问局部变量name和age：name = " + name + ", age = " + age);
    }
}
public class Example07 {
    public static void main(String[] args){
        User user = new User();
        user.setName("张三");
        user.setAge(18);
        user.print();
    }
}
