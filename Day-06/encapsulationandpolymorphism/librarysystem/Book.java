package encapsulationandpolymorphism.librarysystem;


// Book class inheriting from LibraryItem and implementing Reservable
class Book extends LibraryItem implements Reservable {
    private String genre;
    private boolean available;

    public Book(String itemId, String title, String author, String genre) {
        super(itemId, title, author);
        this.genre = genre;
        this.available = true;
    }

    @Override
    public int getLoanDuration() {
        return 14;  // Book loan duration is 14 days
    }

    @Override
    public void reserveItem() {
        if (available) {
            available = false;
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is not available for reservation.");
        }
    }

    @Override
    public String checkAvailability() {
        return available ? "Available" : "Not available";
    }
}
