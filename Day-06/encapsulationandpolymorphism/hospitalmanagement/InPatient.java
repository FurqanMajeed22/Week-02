package encapsulationandpolymorphism.hospitalmanagement;


// Class InPatient extends Patient and implements MedicalRecord
class InPatient extends Patient implements MedicalRecord {
    double roomCharge;
    double treatmentCost;
    String records;

    // Constructor
    public InPatient(String patientId, String name, int age, double roomCharge, double treatmentCost) {
        super(patientId, name, age);
        this.roomCharge = roomCharge;
        this.treatmentCost = treatmentCost;
        this.records = ""; // Initialize empty records
    }

    // Implement abstract method from Patient
    public double calculateBill() {
        return roomCharge + treatmentCost;
    }

    // Implement methods from MedicalRecord interface
    public void addRecord(String record) {
        this.records += record + "\n";
    }

    public String viewRecords() {
        return this.records;
    }
}
