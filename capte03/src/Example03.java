class Bankccount{
    String accountNumber;
    double balance;
    public void broadcast(String accountNumber,double balance){
        System.out.println("账户" + accountNumber + "的余额为" + balance + "元");
    }
}
public class Example03 {
    public static void main(String[] arges){
        Bankccount account = new Bankccount();
        account.accountNumber = "123456";
        account.balance = -500;
        account.broadcast(account.accountNumber,account.balance);
    }
}
