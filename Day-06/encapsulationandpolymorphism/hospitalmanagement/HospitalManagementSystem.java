package encapsulationandpolymorphism.hospitalmanagement;
class HospitalManagementSystem {
    public static void main(String[] args) {
        // Create InPatient and OutPatient objects
        InPatient inPatient = new InPatient("P001", "Furqan", 21, 1500.0, 3000.0);
        OutPatient outPatient = new OutPatient("P002", "Anubhav", 21, 200.0);

        // Add medical records
        inPatient.addRecord("Diagnosis: Heart Disease, Treatment: Surgery");
        outPatient.addRecord("Diagnosis: Cold, Treatment: Consultation");
        // Create a hospital and add patients
        Hospital hospital = new Hospital(5);
        hospital.addPatient(inPatient);
        hospital.addPatient(outPatient);

        // Process and display patients' details and bills
        hospital.processPatients();
    }
}
