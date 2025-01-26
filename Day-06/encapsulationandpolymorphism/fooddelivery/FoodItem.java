package encapsulationandpolymorphism.fooddelivery;


// Abstract class FoodItem
abstract class FoodItem {
    String itemName;
    double price;
    int quantity;

    // Constructor
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Abstract method to calculate total price
    abstract double calculateTotalPrice();

    // Concrete method to get item details
    public String getItemDetails() {
        return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }
}