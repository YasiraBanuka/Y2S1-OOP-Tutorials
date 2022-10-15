package Ex2;

public abstract class Account {

    private String accountNo, name;
    protected double balance;

    public Account(String accountNo, String name, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
    }

    void Deposit(double amount) {
        balance = balance + amount;
    }

    abstract double calculateInterest();

    public void display() {
        System.out.println("Account No. : " + this.accountNo);
        System.out.println("Name : " + this.name);
        System.out.println("Balance : " + this.balance);
    }

}
