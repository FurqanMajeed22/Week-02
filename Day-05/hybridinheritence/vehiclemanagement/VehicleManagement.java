package hybridinheritence.vehiclemanagement;
// Test the system
public class VehicleManagement {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(160, "Tesla");
        PetrolVehicle pv = new PetrolVehicle(190, "Rolls Royce");

        ev.charge();
        pv.refuel();
    }
}
