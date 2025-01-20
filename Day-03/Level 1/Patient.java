public class Patient {
    // Static variable shared among all patients
    private static String hospitalName = "AIMS BHOPAL";
    private static int totalPatients = 0;
    // Instance variables
    private final int patientID;
    private String name;
    private int age;
    private String ailment;
    // Constructor to initialize patient details
    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++; // Increment total patient count
    }

    // Static method to get total number of patients
    public static void getTotalPatients() {
        System.out.println(totalPatients);
    }
    // Method to display patient details
    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Hospital: " + hospitalName);
        } else {
            System.out.println("Invalid object.");
        }
    }

    // Setter for hospitalName
    public static void setHospitalName(String newHospitalName) {
        hospitalName = newHospitalName;
    }
    public static void main(String[] args) {
        Patient hmpv=new Patient(1234,"ABC",21,"Stomach Ailment");
        Patient Covid=new Patient(1234,"DEF",21,"Cough");
        hmpv.displayPatientDetails();
        Covid.displayPatientDetails();
        Patient.getTotalPatients();
    }
}