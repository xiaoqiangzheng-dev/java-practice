public class Example11 {
    public static void main(String[] args) {
        int score = 78;
        String grade;
        switch (score / 10) {
            case 10:
            case 9:
                grade = "优秀";
                break;
            case 8:
                grade = "良好";
                break;
            case 7:
                grade = "中等";
                break;
            case 6:
                grade = "及格";
                break;
            default:
                grade = "不及格";
                break;
        }
        System.out.println("您的等级是" + grade);
    }
}
