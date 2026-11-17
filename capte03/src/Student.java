public class Student {
    String name;
    int classId;
    int studentId;
    String address;
    public void introduce(){
        System.out.println("大家好，我是" + classId + "班的" + name + "，我的学号是" + studentId + "，我来自" + address + "。");
    }
    public void study(){
        System.out.println("我要开始学习了！");
    }
}
