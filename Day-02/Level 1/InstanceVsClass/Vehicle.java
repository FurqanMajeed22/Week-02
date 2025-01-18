public class Vehicle {
    // Instance variables
    private String ownerName;
    private String vehicleType;
    // Class variable
    private static double registrationFee = 1000.00; // Default registration fee
    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    // Class method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Update the registration fee
        Vehicle.updateRegistrationFee(150.00);
        // Create Vehicle objects
        Vehicle vehicle1 = new Vehicle("Furqan", "Car");
        Vehicle vehicle2 = new Vehicle("Anubhav", "Motorcycle");
        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
    }
}
