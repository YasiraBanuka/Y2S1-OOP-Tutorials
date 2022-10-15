package Ex2;

public class Ex2_Main {

    public static void main(String[] args) {

        Account acc1 = new FixedDepositAccount("800334", "Saman", 5000);
        SavingsAccount acc2 = new SavingsAccount("70058", "Kamal", 4000);

        acc1.display();

        acc1.Deposit(2000);
        acc1.display();

        acc2.Deposit(1000);
        acc2.withdraw(200);
        acc2.display();

    }

}
