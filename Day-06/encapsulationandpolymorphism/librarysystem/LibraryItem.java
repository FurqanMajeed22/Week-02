package encapsulationandpolymorphism.librarysystem;
// Abstract class representing a library item
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private String borrower;
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.borrower = null;  // Initially no borrower
    }

    // Abstract method to get loan duration
    public abstract int getLoanDuration();

    // Concrete method to get item details
    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }

    public void borrow(String borrower) {
        this.borrower = borrower;
    }

    public void returnItem() {
        this.borrower = null;
    }

    public String getBorrower() {
        return borrower;
    }
}
