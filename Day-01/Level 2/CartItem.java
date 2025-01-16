public class CartItem {
    private String itemName;
    private double price;
    private int quantity;
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    // Add more items to the cart
    public void addItem(int quantity) {
        this.quantity += quantity;
    }

    // Remove items from the cart
    public void removeItem(int quantity) {
        if (quantity <= this.quantity) {
            this.quantity -= quantity;
        } else {
            System.out.println("Cannot remove more items than present in the cart.");
        }
    }

    public double totalCost() {
        return this.price * this.quantity;
    }
 
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public static void main(String[] args) {
        CartItem item1 = new CartItem("Apple", 2.54, 5);
    
        item1.addItem(3);
        item1.removeItem(2);
        System.out.println("Total cost of  " + item1.getItemName() +" " +item1.totalCost());
    }
}
