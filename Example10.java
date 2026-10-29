public class Example10 {
   public static void main(String[] args){
       int month = 1;
       String season;
       if (month >= 3 && month <= 5){
           season = "春季";
       }else if (month >= 6 && month <= 8){
           season = "夏季";
       }else if (month >= 9 && month <= 11){
           season = "秋季";
       }else {
           season = "冬季";
       }
       System.out.println("当前季节是" + season + "!");
   }
}
