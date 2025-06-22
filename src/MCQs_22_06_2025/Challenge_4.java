package MCQs_22_06_2025;

public class Challenge_4 {
    public static void main(String[] args) {
        BankAccount a1=new BankAccount("A1200",100000);
        System.out.println("Withdraw");
        a1.withdraw(500);
        System.out.println("Balance : " + a1.getBalance());
        a1.deposit(500);;
        System.out.println("Balance : " + a1.getBalance());
        a1.withdraw(2000000);
        System.out.println("Balance : " + a1.getBalance());

    }
}
class BankAccount{
   private String accountNumber;
    private double balance;
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void withdraw(double amount){
        if (balance >= amount) {
            balance = balance-amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
    public void deposit(double amount){
        balance=balance+amount;

    }

    public double getBalance() {
        return balance;
    }
}
