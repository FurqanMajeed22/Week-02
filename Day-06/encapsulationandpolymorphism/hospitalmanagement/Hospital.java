package encapsulationandpolymorphism.hospitalmanagement;


// Class Hospital to manage the patients and handle polymorphism
class Hospital {
    Patient[] patients;
    int count;

    // Constructor
    public Hospital(int size) {
        patients = new Patient[size];
        count = 0;
    }

    // Add patient to the hospital
    public void addPatient(Patient patient) {
        if(count < patients.length) {
            patients[count] = patient;
            count++;
        }
    }

    // Process patients and display their billing details
    public void processPatients() {
        for(int i = 0; i < count; i++) {
            Patient patient = patients[i];
            System.out.println(patient.getPatientDetails());
            System.out.println("Total Bill: " + patient.calculateBill());
            if(patient instanceof MedicalRecord) {
                MedicalRecord record = (MedicalRecord) patient;
                System.out.println("Patient Records: \n" + record.viewRecords());
            }
            System.out.println();
        }
    }
}