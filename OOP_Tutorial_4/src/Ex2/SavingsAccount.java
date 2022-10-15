package Ex2;

public class SavingsAccount extends FixedDepositAccount {

    public SavingsAccount(String accountNo, String name, double balance) {
        super(accountNo, name, balance);
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    double calculateInterest() {
        Interest = balance * interestRate/100/12;
        return Interest;
    }

}
