// Main class
public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(101, 5000, 4.5);
        CheckingAccount checking = new CheckingAccount(102, 3000, 1000);
        FixedDepositAccount fd = new FixedDepositAccount(103, 20000, 5);

        savings.displayAccountType();
        savings.displayBalance();

        checking.displayAccountType();
        checking.displayBalance();

        fd.displayAccountType();
        fd.displayBalance();
    }
}
