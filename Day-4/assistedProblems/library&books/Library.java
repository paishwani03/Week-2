// create a class Library

import java.util.ArrayList;
import java.util.List;

public class Library {

    // give the library a name
    private String name;

    // create a list of books
    private List<Book> books ;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // add a book to the list
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added to the " + name + " library");
    }

    // show all the books in the library

    public void showBooks() {
        System.out.println("Books in the library are: ");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + " Author: " + book.getAuthor());
        }
    }
}

