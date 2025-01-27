public class CartItem {
    // Fields to store item details
    private String itemName;
    private double price;
    private int quantity;

    // Method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        System.out.println("Added " + quantity + " x " + itemName + " to the cart.");
    }

    // Method to remove the current item from the cart
    public void removeItem() {
        if (itemName == null) {
            System.out.println("The cart is already empty.");
        } else {
            System.out.println("Removed " + itemName + " from the cart.");
            itemName = null;  // Clear the item from the cart
            price = 0;
            quantity = 0;
        }
    }

    // Method to display the total cost of the cart
    public void displayTotalCost() {
        if (itemName == null) {
            System.out.println("The cart is empty. No items to calculate cost.");
        } else {
            double totalCost = price * quantity;
            System.out.println("Total Cost: $" + totalCost);
        }
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        CartItem cart = new CartItem();

        // Add an item to the cart
        cart.addItem("Laptop", 1200.50, 1);

        // Display total cost
        cart.displayTotalCost();

        // Remove the item from the cart
        cart.removeItem();

        // Try to display total cost after removal
        cart.displayTotalCost();
    }
}



