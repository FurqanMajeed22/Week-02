package singleinheritence.smarthomedevices;
public class SmartHomeDevices {
    public static void main(String[] args) {
        Device device = new Device("H1", "Active");
        Thermostat thermostat = new Thermostat("B1", "Active", 22);

        device.displayStatus();
        thermostat.displayStatus();
    }
}
