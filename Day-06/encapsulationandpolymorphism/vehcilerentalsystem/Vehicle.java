package encapsulationandpolymorphism.vehcilerentalsystem;
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    protected double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);

    public String getVehicleDetails() {
        return "Vehicle Number: " + vehicleNumber + ", Type: " + type + ", Rental Rate: " + rentalRate;
    }
}

