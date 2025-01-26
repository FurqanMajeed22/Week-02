package encapsulationandpolymorphism.librarysystem;



// Main class to demonstrate polymorphism
public class LibrarySystem {
    public static void main(String[] args) {
        // Create instances of different LibraryItems
        LibraryItem book1 = new Book("101", "1984", "Game of thrones", "Dystopian");
        LibraryItem magazine1 = new Magazine("102", "House Of Dragons", "Various", "December 2024");
        LibraryItem dvd1 = new DVD("103", "The Matrix", "The Witcher", "Region 1");
        // Polymorphism: Using LibraryItem reference to manage different items
        LibraryItem[] libraryItems = {book1, magazine1, dvd1};
        for (LibraryItem item : libraryItems) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            System.out.println("Availability: " + ((Reservable) item).checkAvailability());
            System.out.println();
        }
        // Reserve items
        ((Reservable) book1).reserveItem();  // Reserve the book
        ((Reservable) magazine1).reserveItem();  // Reserve the magazine
        ((Reservable) dvd1).reserveItem();  // Reserve the DVD
    }
}
