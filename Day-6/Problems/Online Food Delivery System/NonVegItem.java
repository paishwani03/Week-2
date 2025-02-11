// Class for Non-Veg Items
class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + 20; // Additional charge of $20 for non-veg items
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05; // 5% discount for Non-Veg items
    }

    @Override
    public String getDiscountDetails() {
        return "Discount: 5%";
    }
}
