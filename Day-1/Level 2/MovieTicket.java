// Class representing a Movie Ticket
public class MovieTicket {
    // Private fields for encapsulation
    private String movieName;
    private String seatNumber;
    private double price;

    // Constructor to initialize ticket attributes
    public MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Method to book a ticket
    public void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    // Method to display ticket details
    public void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + price);
    }

    // Main method to test the MovieTicket class
    public static void main(String[] args) {
        // Creating a MovieTicket object
        MovieTicket ticket = new MovieTicket("Avengers: Endgame", "A12", 15.99);

        // Displaying ticket details
        ticket.displayDetails();

        // Booking a new ticket
        ticket.bookTicket("B10", 20.99);

        // Displaying updated ticket details
        ticket.displayDetails();
    }
}

