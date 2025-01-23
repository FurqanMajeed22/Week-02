import java.util.ArrayList;
import java.util.List;
class Customer{
   private String name;
   private List<Order>orders;
   Customer(String name){
       this.name=name;
       this.orders=new ArrayList<>();
   }
   public  void placeOrder(Order od){
       if(!orders.contains(od)){
           orders.add(od);
       }
       System.out.println("order placed");
   }
   public String getName(){
       return this.name;
   }
    public void showOrders() {
        System.out.println("Customer: " + name);
        for (Order order : orders) {
            order.showOrderDetails();
        }
    }

}
class Order{
    private int orderId;
    List<Product>products;
    Order(int id){
        this.orderId=id;
        this.products=new ArrayList<>();
    }
    public  void addProduct(Product p){
        if(!products.contains(p)){
            products.add(p);
        }
    }
    public  int getOrderName(){
        return  this.orderId;
    }
    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        for (Product product : products) {
            System.out.println("Product: " + product.getProductName()+ ", Price: " + product.getPrice());
        }
    }
}

class Product{
    private String name;
    private double price;
    Product(String name,double price){
        this.name=name;
        this.price=price;
    }
    public  String getProductName(){
        return this.name;
    }
    public double getPrice() {
        return price;
    }

}
public class ECommerce {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1000.00);
        Product product2 = new Product("Phone", 500.00);

        Order order1 = new Order(1);
        order1.addProduct(product1);
        order1.addProduct(product2);

        Customer customer = new Customer("Furqan Majeed");
        customer.placeOrder(order1);

        customer.showOrders();
    }
}
