public class Book {
    // Static variable shared across all books
    private static String libraryName = "Book  House";
    // Final variable to ensure ISBN cannot be changed
     final String isbn;
     String title;
     String author;
    // Constructor using this keyword
     public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
      }
     // Static method to display the library name
     public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
    // Method to display book details, using instanceof to check object type
    public void displayBookDetails(Object obj) {
         if(obj instanceof  Book){
             System.out.println("Isbn: "+((Book) obj).isbn);
             System.out.println("title: "+((Book) obj).title);
             System.out.println("author: "+((Book) obj).author);
         }else{
             System.out.println("invalid Book");
         }

    }

    public static void main(String[] args) {
        Book book1 = new Book("House Of Dragons", "Furqan Majeed", "123456789");
        Book.displayLibraryName();
        book1.displayBookDetails(book1);
    }
}
