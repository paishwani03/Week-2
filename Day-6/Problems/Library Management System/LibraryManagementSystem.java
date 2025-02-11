class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem book = new Book("B001", "Java Basics", "John Doe");
        LibraryItem magazine = new Magazine("M001", "Tech Today", "Jane Doe");
        LibraryItem dvd = new DVD("D001", "Inception", "Christopher Nolan");

        book.getItemDetails();
        System.out.println("Loan duration: " + book.getLoanDuration() + " days");
        ((Reservable) book).reserveItem();

        magazine.getItemDetails();
        System.out.println("Loan duration: " + magazine.getLoanDuration() + " days");
        ((Reservable) magazine).reserveItem();

        dvd.getItemDetails();
        System.out.println("Loan duration: " + dvd.getLoanDuration() + " days");
        ((Reservable) dvd).reserveItem();
    }
}