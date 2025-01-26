package encapsulationandpolymorphism.librarysystem;

// Magazine class inheriting from LibraryItem and implementing Reservable
class Magazine extends LibraryItem implements Reservable {
    private String issue;
    private boolean available;

    public Magazine(String itemId, String title, String author, String issue) {
        super(itemId, title, author);
        this.issue = issue;
        this.available = true;
    }

    @Override
    public int getLoanDuration() {
        return 7;  // Magazine loan duration is 7 days
    }

    @Override
    public void reserveItem() {
        if (available) {
            available = false;
            System.out.println("Magazine reserved successfully.");
        } else {
            System.out.println("Magazine is not available for reservation.");
        }
    }

    @Override
    public String checkAvailability() {
        return available ? "Available" : "Not available";
    }
}
