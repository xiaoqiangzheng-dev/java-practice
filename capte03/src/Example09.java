class Student1{
    private String name;
    private int age;
    public Student1(){
        System.out.println("实例化了一个新的Student对象");
    }
    public Student1(String name,int age){
        this();
        this.name = name;
        this.age = age;
    }
    public void print(){
        System.out.println("我是" + name + "，年龄" + age);;
    }
}
public class Example09 {
    public static void main(String[] args){
        Student1 student = new Student1("张三",18);
        student.print();
    }
}
