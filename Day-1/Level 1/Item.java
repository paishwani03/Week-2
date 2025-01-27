// Class representing an Item in inventory
public class Item {
    // Private fields for encapsulation
    private String itemCode;
    private String itemName;
    private double price;

    // Constructor to initialize item attributes
    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: $" + price);
    }

    // Method to calculate total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    // Main method to test the Item class
    public static void main(String[] args) {
        // Creating an Item object
        Item item = new Item("I001", "Laptop", 800);
        
        // Displaying item details
        item.displayDetails();
        
        // Calculating and displaying total cost for 3 items
        System.out.println("Total Cost for 3 items: $" + item.calculateTotalCost(3));
    }
}

