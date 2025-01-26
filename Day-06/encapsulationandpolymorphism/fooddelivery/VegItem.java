package encapsulationandpolymorphism.fooddelivery;


// Class VegItem extends FoodItem and implements Discountable
class VegItem extends FoodItem implements Discountable {

    // Constructor
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    // Implement abstract method from FoodItem
    public double calculateTotalPrice() {
        return price * quantity;
    }

    // Implement methods from Discountable interface
    public double applyDiscount() {
        return 0.05 * (price * quantity);  // 5% discount for veg items
    }

    public String getDiscountDetails() {
        return "Discount: 5% on " + itemName;
    }
}
