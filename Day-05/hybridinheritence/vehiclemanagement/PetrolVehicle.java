package hybridinheritence.vehiclemanagement;
// Subclass PetrolVehicle inheriting from Vehicle and implementing Refuelable
class PetrolVehicle extends Vehicle1 implements Refuelable {
    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling");
    }
}