// Account class
class Account {
    private int accountNumber;
    private int balance;
    private Bank bank;

    public Account(int accountNumber, Bank bank) {
        this.accountNumber = accountNumber;
        this.bank = bank;
        this.balance = 0;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public Bank getBank() {
        return bank;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " into account " + accountNumber + " at " + bank.getName() + " bank.");
    }

    public void viewBalance() {
        System.out.println("Balance for account " + accountNumber + " at " + bank.getName() + ": " + balance);
    }
}
