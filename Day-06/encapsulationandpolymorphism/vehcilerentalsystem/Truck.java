package encapsulationandpolymorphism.vehcilerentalsystem;

class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * rentalRate * 1.5;
    }

    @Override
    public double calculateInsurance() {
        return rentalRate * 0.2;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy: Confidential";
    }
}
