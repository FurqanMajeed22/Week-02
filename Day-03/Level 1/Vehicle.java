public class Vehicle {
    // Static variable for registration fee
    private static double registrationFee = 500.0;
    // Instance variables
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;
    // Constructor using this keyword
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }
    // Static method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Method to check if an object is an instance of Vehicle before displaying registration
    public void displayDetails(Object obj) {
        if (obj instanceof Vehicle) {
            System.out.println("Owner: " + ((Vehicle) obj).ownerName);
            System.out.println("Vehicle Type: " +((Vehicle) obj).vehicleType);
            System.out.println("Registration Number: " + ((Vehicle) obj).registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        } else {
            System.out.println("Invalid Vehicle");
        }
    }

    public static void main(String[] args) {
        Vehicle car = new Vehicle("Furqan", "Car", "ABC123");
        car.displayDetails(car);

        Vehicle.updateRegistrationFee(600.0);
        car.displayDetails(car);
    }
}
