public class Student {
    // Static variable shared across all students
    private static String universityName = "RGPV UNIVERSITY";
    private static int totalStudents = 0;
    // Instance variables
    private String name;
    private final int rollNumber; // Final variable that cannot be changed
    private char grade;
    // Constructor using this to initialize instance variables
    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++; // Increment total students count
    }
    // Static method to display the total number of students
    public static void displayTotalStudents() {
        System.out.println("Total students enrolled: " + totalStudents);
    }
    // Method to update grade if the object is an instance of Student
    public void updateGrade(char newGrade) {
        if (this instanceof Student) {
             this.grade = newGrade;
            System.out.println("Grade updated to: " + this.grade);
        } else {
            System.out.println("Operation not allowed.");
        }
    }
    // Method to display student details
    public void displayStudentDetails(Object obj) {
        if (obj instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Name: " + ((Student) obj).name);
            System.out.println("Roll Number: " + ((Student) obj).rollNumber);
            System.out.println("Grade: " + ((Student) obj).grade);
        } else {
            System.out.println("Invalid student instance.");
        }
    }

    // Static method to set university name
    public static void setUniversityName(String newUniversityName) {
        universityName = newUniversityName;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Furqan", 101, 'A');
        Student s2 = new Student("Anubhav", 102, 'B');

        s1.displayStudentDetails(s1);
        s2.displayStudentDetails(s2);

        s1.updateGrade('A');

        Student.displayTotalStudents();

    }
}
