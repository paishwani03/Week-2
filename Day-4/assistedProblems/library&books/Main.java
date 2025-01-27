//Main class to test the code
public class Main {
    public static void main(String[] args) {
        // create a library object
        Library library = new Library("Wiley");

        // create book objects
        Book book1 = new Book("Java", "James Gosling");
        Book book2 = new Book("Python", "Guido van Rossum");
        Book book3 = new Book("C++", "Bjarne Stroustrup");

        // add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // show all the books in the library
        library.showBooks();
    }
}
