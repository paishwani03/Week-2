class BankingSystem {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("SA123", "Alice", 5000);
        BankAccount current = new CurrentAccount("CA456", "Bob", 10000);

        System.out.println("Savings interest: " + savings.calculateInterest());
        System.out.println("Current interest: " + current.calculateInterest());
    }
}
