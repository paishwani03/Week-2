// Class representing a Bank Account
public class BankAccount {
    // Private fields for encapsulation
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor to initialize account attributes
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + ". New balance: $" + balance);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
        }
    }

    // Method to display current balance
    public void displayBalance() {
        System.out.println("Current balance: $" + balance);
    }

    // Main method to test the BankAccount class
    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount account = new BankAccount("John Doe", "12345678", 1000);

        // Performing ATM operations
        account.displayBalance();
        account.deposit(500);
        account.withdraw(300);
        account.withdraw(1500);
    }
}

