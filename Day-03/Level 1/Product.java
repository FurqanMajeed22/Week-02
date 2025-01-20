public class Product {
    //static for discount
    private static double discount = 0;
    //final for productid
    private final int id;
    private String productName;
    private double price;
    private int quantity;
   //Constructor
    Product(String productName, double price, int quantity, int id) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.id = id;
    }
    //Method to set Discount which is static
    public static void setDiscount(double dis) {
        discount = dis;
    }
    //using instanceof to display details
    public void displayDetails(Object obj) {
        if (obj instanceof Product) {
            System.out.println("Product Id: " + ((Product) obj).id);
            System.out.println("Product Name: " + ((Product) obj).productName);
            System.out.println("Price: " + ((Product) obj).price);
            System.out.println("Product Quantity: " + ((Product) obj).quantity);
            System.out.println("Discount Percentage: "+discount);
        } else {
            System.out.println("Invalid Product");
        }
    }

    public static void main(String[] args) {
        Product.setDiscount(45.0);
        Product Laptop=new Product("Lenevo",65550.89,3,908);
        Laptop.displayDetails(Laptop);

    }


}
