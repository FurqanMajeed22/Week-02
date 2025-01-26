package encapsulationandpolymorphism.ecommerce;

// Groceries subclass extending Product (no tax for groceries, so it doesn't implement Taxable)
class Groceries extends Product {
    private double discountPercentage;

    public Groceries(int productId, String name, double price, double discountPercentage) {
        super(productId, name, price);
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double calculateDiscount() {
        return (getPrice() * discountPercentage) / 100;  // Discount based on percentage
    }
}
