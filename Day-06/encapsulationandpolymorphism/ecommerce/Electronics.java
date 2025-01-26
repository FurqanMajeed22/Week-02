package encapsulationandpolymorphism.ecommerce;

// Electronics subclass extending Product and implementing Taxable
class Electronics extends Product implements Taxable {
    private double discountPercentage;
    public Electronics(int productId, String name, double price, double discountPercentage) {
        super(productId, name, price);
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double calculateDiscount() {
        return (getPrice() * discountPercentage) / 100;  // Discount based on percentage
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.15;  // Electronics have a 15% tax
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Electronics Tax Rate: 15%");
    }
}
