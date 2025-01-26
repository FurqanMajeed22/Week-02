package encapsulationandpolymorphism.ridehailing;
// Car class implementing Vehicle and GPS interface
class Car extends Vehicle implements GPS {
    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        // Car fare calculation (e.g., rate per km * distance)
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation() {
        return "Current location of Car: City Center";
    }

    @Override
    public void updateLocation(String newLocation) {
        System.out.println("Car location updated to: " + newLocation);
    }
}
