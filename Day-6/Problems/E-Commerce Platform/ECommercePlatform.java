class ECommercePlatform {
    public static void main(String[] args) {
        Product product1 = new Electronics(101, "Laptop", 1000);
        Product product2 = new Clothing(102, "Shirt", 50);

        double finalPrice1 = product1.getPrice() + ((Taxable) product1).calculateTax() - product1.calculateDiscount();
        double finalPrice2 = product2.getPrice() + ((Taxable) product2).calculateTax() - product2.calculateDiscount();

        System.out.println("Final price of " + product1.getName() + ": $" + finalPrice1);
        System.out.println("Final price of " + product2.getName() + ": $" + finalPrice2);
    }
}
