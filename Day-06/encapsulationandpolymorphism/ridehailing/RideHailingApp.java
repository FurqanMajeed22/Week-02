package encapsulationandpolymorphism.ridehailing;
// RideHailingApp class to demonstrate polymorphism
public class RideHailingApp {
    public static void main(String[] args) {
        // Create different vehicle instances
        Vehicle car = new Car("V001", "John Doe", 10.0);
        Vehicle bike = new Bike("V002", "Jane Smith", 5.0);
        Vehicle auto = new Auto("V003", "Alex Brown", 8.0);

        // Calculate fares for different vehicles
        System.out.println("Fare for Car (15 km): " + car.calculateFare(15));
        System.out.println("Fare for Bike (15 km): " + bike.calculateFare(15));
        System.out.println("Fare for Auto (15 km): " + auto.calculateFare(15));

        // Polymorphism in action: Using the same reference to calculate fare dynamically
        Vehicle[] vehicles = {car, bike, auto};
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVehicleDetails());
            System.out.println("Fare for 10 km: " + vehicle.calculateFare(10));
            if (vehicle instanceof GPS) {
                GPS gps = (GPS) vehicle;
                System.out.println(gps.getCurrentLocation());
                gps.updateLocation("New Location");
            }
            System.out.println();
        }
    }
}
