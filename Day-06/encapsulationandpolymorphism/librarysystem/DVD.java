package encapsulationandpolymorphism.librarysystem;

// DVD class inheriting from LibraryItem and implementing Reservable
class DVD extends LibraryItem implements Reservable {
    private String region;
    private boolean available;

    public DVD(String itemId, String title, String author, String region) {
        super(itemId, title, author);
        this.region = region;
        this.available = true;
    }

    @Override
    public int getLoanDuration() {
        return 3;  // DVD loan duration is 3 days
    }

    @Override
    public void reserveItem() {
        if (available) {
            available = false;
            System.out.println("DVD reserved successfully.");
        } else {
            System.out.println("DVD is not available for reservation.");
        }
    }

    @Override
    public String checkAvailability() {
        return available ? "Available" : "Not available";
    }
}
