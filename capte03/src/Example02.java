class Staff {
    String name;
    int Salary;
}
public class Example02 {
    public static void modifySalary(int salary){
        salary += 1000;
    }
    public static void modifyStaffSalary(Staff staff){
        staff.Salary += 1000;
    }
    public static void main(String[] args) {
        Staff staff = new Staff();
        staff.name = "小王";
        staff.Salary = 5000;
        System.out.println(staff.name + "的原本薪水：" + staff.Salary + "元/月");
        modifySalary(staff.Salary);
        System.out.println("值传递加薪：" + staff.name + "加薪后薪水" +staff.Salary + "元/月");
        modifyStaffSalary(staff);
        System.out.println("引用传递加薪："+staff.name + "加薪后薪水为" + staff.Salary +"元/月");
    }
}

