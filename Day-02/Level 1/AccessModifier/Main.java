// Base class
class Student {
    // Instance variables
    public int rollNumber;
    protected String name;
    private double CGPA;

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to get CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to set CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) { // Validating CGPA range
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA. Please enter a value between 0.0 and 10.0.");
        }
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass
class PostgraduateStudent extends Student {

    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA); // Call the base class constructor

    }

    // Method to display postgraduate student details
    public void displayPostgraduateDetails() {
        // Accessing the protected member `name` from the base class
        System.out.println("Postgraduate Student Details:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);

        System.out.println("CGPA: " + getCGPA());
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Creating a Student object
        Student student1 = new Student(101, "Alice", 9.0);
        student1.displayStudentDetails();
        System.out.println();

        // Modifying and accessing CGPA using public methods
        student1.setCGPA(9.5);
        System.out.println("Updated CGPA: " + student1.getCGPA());
        System.out.println();

        // Creating a PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Bob", 8.8, "Computer Science");
        pgStudent.displayPostgraduateDetails();
    }
}
