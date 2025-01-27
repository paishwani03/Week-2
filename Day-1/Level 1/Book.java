
// Class representing a Book
public class Book {
    // Private fields for encapsulation
    private String title;
    private String author;
    private double price;

    // Constructor to initialize book attributes
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    // Main method to test the Book class
    public static void main(String[] args) {
        // Creating a Book object
        Book book = new Book("Effective Java", "Joshua Bloch", 45.99);
        // Displaying book details
        book.displayDetails();
    }
}

