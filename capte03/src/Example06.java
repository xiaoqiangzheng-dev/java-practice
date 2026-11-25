class Person {
    private String name;
    private String role;
    private String subject;

    public Person(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public Person(String name, String role, String subject) {
        this.name = name;
        this.role = role;
        this.subject = subject;
    }

    public void print() {
        System.out.print("姓名：" + name + " ");
        System.out.print("身份：" + role + " ");
        System.out.println("教学科目：" + subject);
    }
}
public class Example06 {
    public static void main(String[] args){
        Person student = new Person("小明","学生");
        student.print();
        Person teacher = new Person("张伟","教师","数学");
        teacher.print();
    }
}
