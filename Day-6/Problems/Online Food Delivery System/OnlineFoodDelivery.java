// Main class for testing
class OnlineFoodDelivery {
    public static void main(String[] args) {
        FoodItem vegItem = new VegItem("Paneer Butter Masala", 10, 3);
        FoodItem nonVegItem = new NonVegItem("Chicken Biryani", 12, 2);

        vegItem.getItemDetails();
        System.out.println("Total Price (after discount): $" + (vegItem.calculateTotalPrice() - ((Discountable) vegItem).applyDiscount()));

        nonVegItem.getItemDetails();
        System.out.println("Total Price (after discount): $" + (nonVegItem.calculateTotalPrice() - ((Discountable) nonVegItem).applyDiscount()));
    }
}
