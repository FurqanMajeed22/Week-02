package encapsulationandpolymorphism.ecommerce;

// Clothing subclass extending Product and implementing Taxable
class Clothing extends Product implements Taxable {
    private double discountPercentage;

    public Clothing(int productId, String name, double price, double discountPercentage) {
        super(productId, name, price);
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double calculateDiscount() {
        return (getPrice() * discountPercentage) / 100;  // Discount based on percentage
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.10;  // Clothing has a 10% tax
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Clothing Tax Rate: 10%");
    }
}
