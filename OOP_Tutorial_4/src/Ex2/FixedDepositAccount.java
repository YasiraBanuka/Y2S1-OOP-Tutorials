package Ex2;

public class FixedDepositAccount extends Account {

    protected double interestRate, Interest;

    public FixedDepositAccount(String accountNo, String name, double balance) {
        super(accountNo, name, balance);
    }

    public double getInterest() {
        return Interest;
    }

    public void setInterest(double interest) {
        Interest = interest;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
         return interestRate;
    }

    double calculateInterest() {
        Interest = balance * interestRate/100;
        return  Interest;
    }

}
