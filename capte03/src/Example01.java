public class Example01 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "小明";
        student1.classId = 12;
        student1.studentId = 1205;
        student1.address = "北京";
        student1.introduce();
        student1.study();
        Student student2 = new Student();
        student2.name = "张三";
        student2.classId = 13;
        student2.studentId = 1301;
        student2.address = "山西";
        student2.introduce();
        student2.study();
    }
}
