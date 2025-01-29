// Subclass SavingsAccount
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("This is a Savings Account with interest rate: " + interestRate + "%");
    }
}
