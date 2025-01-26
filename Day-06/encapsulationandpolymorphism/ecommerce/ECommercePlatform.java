package encapsulationandpolymorphism.ecommerce;
public class ECommercePlatform {
    public static void main(String[] args) {
        // Creating product objects
        Electronics electronicProduct = new Electronics(101, "Laptop", 1200, 20);
        Clothing clothingProduct = new Clothing(102, "T-Shirt", 30, 20);
        Groceries groceryProduct = new Groceries(103, "Apple", 5, 5);

        // Adding products to an array
        Product[] products = {electronicProduct, clothingProduct, groceryProduct};

        // Displaying product details and final prices
        for (Product product : products) {
            product.displayDetails();
            System.out.println();
        }
    }
}
