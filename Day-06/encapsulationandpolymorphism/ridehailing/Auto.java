package encapsulationandpolymorphism.ridehailing;


// Auto class implementing Vehicle and GPS interface
class Auto extends Vehicle implements GPS {
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        // Auto fare calculation (e.g., rate per km * distance)
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation() {
        return "Current location of Auto: Airport Road";
    }

    @Override
    public void updateLocation(String newLocation) {
        System.out.println("Auto location updated to: " + newLocation);
    }
}
