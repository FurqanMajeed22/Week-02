package encapsulationandpolymorphism.vehcilerentalsystem;
import java.util.ArrayList;
import java.util.List;
public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Toyoto", 50, "POL12345"));
        vehicles.add(new Bike("Rolls Royce", 20, "POL67890"));
        vehicles.add(new Truck("Fortuner", 100, "POL11223"));

        for (Vehicle vehicle : vehicles) {
            Insurable insurable = (Insurable) vehicle;
            System.out.println(vehicle.getVehicleDetails() + ", Rental Cost for 5 days: " + vehicle.calculateRentalCost(5) + ", Insurance: " + insurable.calculateInsurance());
        }
    }
}
