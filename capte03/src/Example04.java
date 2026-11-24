class BankAccount {
    private String accountNumber;
    private double balance;
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public void setBalance(double balance){
        if (balance < 0){
            System.out.println("输入金额有误！");
        }else {
            this.balance = balance;
        }
    }
    public double getBalance(){
        return balance;
    }
    public void broadcast(String accountNumber,double balance){
        System.out.println("账户" + accountNumber + "的余额为" + balance + "元");
    }
}
public class Example04 {
    public static void main(String[] args){
        BankAccount account = new BankAccount();
        account.setAccountNumber("123456");
        account.setBalance(-500);
        account.broadcast(account.getAccountNumber(),
                account.getBalance());
    }
}
