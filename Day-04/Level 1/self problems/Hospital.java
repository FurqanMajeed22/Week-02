import java.util.ArrayList;
import  java.util.List;
class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this); // Ensure bidirectional association
        }
    }

    public void consult(Patient patient) {
        if (patients.contains(patient)) {
            System.out.println("Dr. " + name + " is consulting patient " + patient.getName());
        } else {
            System.out.println("Dr. " + name + " does not have a record of patient " + patient.getName());
        }
    }
}

class Patient {
    private String name;
    private List<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
            doctor.addPatient(this); //Ensure bidirectional association
        }
    }
}

public class Hospital {
    public static void main(String[] args) {
        Doctor doc1 = new Doctor("Furqan Majeed");
        Doctor doc2 = new Doctor("Deepansh Khare");

        Patient patient1 = new Patient("Om");
        Patient patient2 = new Patient("Anubhav");

        // Establish doctor-patient relationships
        doc1.addPatient(patient1);
        doc1.addPatient(patient2);
        doc2.addPatient(patient1);

        // Perform consultations
        doc1.consult(patient1);
        doc1.consult(patient2);
        doc2.consult(patient1);
        // Testing an unassociated consultation
        doc2.consult(patient2);
    }
}
