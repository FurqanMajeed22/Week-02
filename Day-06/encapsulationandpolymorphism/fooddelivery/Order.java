package encapsulationandpolymorphism.fooddelivery;

// Class Order to handle the food items and process the order
class Order {
    FoodItem[] foodItems;
    int count;

    // Constructor
    public Order(int size) {
        foodItems = new FoodItem[size];
        count = 0;
    }

    // Add food item to the order
    public void addFoodItem(FoodItem foodItem) {
        if(count < foodItems.length) {
            foodItems[count] = foodItem;
            count++;
        }
    }

    // Process the order, calculate total price, apply discount, etc.
    public void processOrder() {
        double totalPrice = 0;
        for(int i = 0; i < count; i++) {
            totalPrice += foodItems[i].calculateTotalPrice();
            System.out.println(foodItems[i].getItemDetails());
        }

        System.out.println("Total price: " + totalPrice);

        // Apply discount if applicable
        for(int i = 0; i < count; i++) {
            if(foodItems[i] instanceof Discountable) {
                Discountable discountableItem = (Discountable) foodItems[i];
                double discount = discountableItem.applyDiscount();
                System.out.println("Applied discount: " + discount);
                totalPrice -= discount;
            }
        }

        System.out.println("Final total price after discount: " + totalPrice);
    }
}
