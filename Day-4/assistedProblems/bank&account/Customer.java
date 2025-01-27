import java.util.ArrayList;
import java.util.List;

// Customer class
class Customer {
    private String name;
    private int customerID;
    private List<Account> accounts;

    public Customer(String name, int customerID) {
        this.name = name;
        this.customerID = customerID;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void openAccount(int accountNumber, Bank bank) {
        Account newAccount = new Account(accountNumber, bank);
        accounts.add(newAccount);
        bank.openAccount();
        System.out.println("Account " + accountNumber + " opened for " + name + " at " + bank.getName() + ".");
    }

    public void depositToAccount(int accountNumber, int amount) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                account.deposit(amount);
                return;
            }
        }
        System.out.println("Account " + accountNumber + " not found.");
    }

    public void viewBalance(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                account.viewBalance();
                return;
            }
        }
        System.out.println("Account " + accountNumber + " not found.");
    }

    public void showAccounts() {
        System.out.println(name + " has the following accounts:");
        for (Account account : accounts) {
            System.out.println("Bank: " + account.getBank().getName() + ", Account Number: " + account.getAccountNumber() + ", Balance: " + account.getBalance());
        }
    }
}