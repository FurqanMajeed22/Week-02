public class Product {
    // Instance variables
    private String productName;
    private double price;
    // Class variable
    private static int totalProducts = 0;
    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment the total products count whenever a new product is created
    }
    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }
    // Class method to display total products
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
    public static void main(String[] args) {
        // Creating Product objects
        Product product1 = new Product("Laptop", 1025.2);
        Product product2 = new Product("Smartphone", 699.99);
        Product product3 = new Product("Headphones", 1655);
        // Displaying individual product details
        product1.displayProductDetails();
        product2.displayProductDetails();
        product3.displayProductDetails();
        // Displaying total number of products
        Product.displayTotalProducts();
    }
}
