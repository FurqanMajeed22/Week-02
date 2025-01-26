package encapsulationandpolymorphism.hospitalmanagement;

// Class OutPatient extends Patient and implements MedicalRecord
class OutPatient extends Patient implements MedicalRecord {
    double consultationFee;
    String records;

    // Constructor
    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.records = ""; // Initialize empty records
    }

    // Implement abstract method from Patient
    public double calculateBill() {
        return consultationFee; // Outpatients only pay consultation fee
    }

    // Implement methods from MedicalRecord interface
    public void addRecord(String record) {
        this.records += record + "\n";
    }

    public String viewRecords() {
        return this.records;
    }
}