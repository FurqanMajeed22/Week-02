package encapsulationandpolymorphism.fooddelivery;


// Class NonVegItem extends FoodItem and implements Discountable
class NonVegItem extends FoodItem implements Discountable {
    double additionalCharge;

    // Constructor
    public NonVegItem(String itemName, double price, int quantity, double additionalCharge) {
        super(itemName, price, quantity);
        this.additionalCharge = additionalCharge;
    }

    // Implement abstract method from FoodItem
    public double calculateTotalPrice() {
        return (price * quantity) + additionalCharge;
    }

    // Implement methods from Discountable interface
    public double applyDiscount() {
        return 0.10 * (price * quantity + additionalCharge);  // 10% discount for non-veg items
    }

    public String getDiscountDetails() {
        return "Discount: 10% on " + itemName;
    }
}
