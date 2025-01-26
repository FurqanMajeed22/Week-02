package encapsulationandpolymorphism.ridehailing;

// Bike class implementing Vehicle and GPS interface
class Bike extends Vehicle implements GPS {
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        // Bike fare calculation (e.g., rate per km * distance, with bike's specific rate)
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation() {
        return "Current location of Bike: Park Street";
    }

    @Override
    public void updateLocation(String newLocation) {
        System.out.println("Bike location updated to: " + newLocation);
    }
}
