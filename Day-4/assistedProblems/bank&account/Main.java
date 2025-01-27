// Main class
public class Main {
    public static void main(String[] args) {
        // Create banks
        Bank hdfc = new Bank("HDFC");
        Bank icici = new Bank("ICICI");
        Bank sbi = new Bank("SBI");

        // Create a customer
        Customer customer = new Customer("John", 123);

        // Open accounts
        customer.openAccount(1001, hdfc);
        customer.openAccount(1002, icici);
        customer.openAccount(1003, sbi);

        // Deposit money
        customer.depositToAccount(1001, 5000);
        customer.depositToAccount(1002, 10000);
        customer.depositToAccount(1003, 15000);

        // View balances
        customer.viewBalance(1001);
        customer.viewBalance(1002);
        customer.viewBalance(1003);

        // Show all accounts
        customer.showAccounts();
    }
}