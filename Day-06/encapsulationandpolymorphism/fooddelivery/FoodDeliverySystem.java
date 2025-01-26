package encapsulationandpolymorphism.fooddelivery;



// Main class to demonstrate the functionality
class FoodDeliverySystem {
    public static void main(String[] args) {
        // Create food items with discounts
        VegItem vegItem = new VegItem("Veg Pizza", 10.0, 2);
        NonVegItem nonVegItem = new NonVegItem("Chicken Burger", 15.0, 3, 5.0);

        // Create an order and add food items
        Order order = new Order(5);
        order.addFoodItem(vegItem);
        order.addFoodItem(nonVegItem);

        // Process the order
        order.processOrder();
    }
}
