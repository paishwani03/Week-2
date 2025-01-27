// Class representing a MobilePhone
public class MobilePhone {
    // Private fields for encapsulation
    private String brand;
    private String model;
    private double price;

    // Constructor to initialize MobilePhone attributes
   public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display MobilePhone details
    public void displayDetails() {
        System.out.println("Brand name: " + brand);
        System.out.println("Model name: " + model);
        System.out.println("Price: $" + price);
    }

    // Main method to test the MobilePhone class
    public static void main(String[] args) {
        // Creating a MobilePhone object
        MobilePhone Phone = new MobilePhone("Samsung", "Galaxy S21", 999.99);
        // Displaying book details
        Phone.displayDetails();
    }
}

