// Subclass FixedDepositAccount
class FixedDepositAccount extends BankAccount {
    int tenure;

    FixedDepositAccount(int accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }

    void displayAccountType() {
        System.out.println("This is a Fixed Deposit Account with tenure: " + tenure + " years");
    }
}
