import java.util.ArrayList;
// Book class can exist independently of a Library
class Book {
    private String title;
    private String author;
    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}
// Library class aggregates Book objects
class Library {
    private String name;
    private ArrayList<Book> books;  // Aggregation: Library has books

    // Constructor
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }
    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Display all books in the library
    public void displayBooks() {
        System.out.println("Library: " + name);
        for (Book book : books) {
            book.displayBook();
        }
    }
}

// Main class to demonstrate aggregation
public  class Main {
    public static void main(String[] args) {
        // Create independent Book objects
        Book book1 = new Book("Great wall", "Furqan Majeed");
        Book book2 = new Book("Game of thrones", "Anubhav Singh");
        Book book3 = new Book("Money Heist", "Om prakash");
        // Create Library objects
        Library library1 = new Library("Science Library");
        Library library2 = new Library("Math Library");

        // Add books to different libraries
        library1.addBook(book1);
        library1.addBook(book2);
        library2.addBook(book2);
        library2.addBook(book3);
        // Display books in libraries
        library1.displayBooks();
        library2.displayBooks();
    }
}
