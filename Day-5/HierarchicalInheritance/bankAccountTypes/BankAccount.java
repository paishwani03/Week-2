// Base class
class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayBalance() {
        System.out.println("Account Number: " + accountNumber + ", Balance: $" + balance);
    }
}