package encapsulationandpolymorphism.hospitalmanagement;
// Abstract class Patient
abstract class Patient {
    String patientId;
    String name;
    int age;
    // Constructor
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }
    // Abstract method to calculate the bill
    abstract double calculateBill();
    // Concrete method to get patient details
    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }
}