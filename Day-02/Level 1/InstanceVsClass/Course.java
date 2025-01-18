public class Course {
    // Instance variables
    private String courseName;
    private int duration; // Duration in weeks
    private double fee;
    // Class variable
    private static String instituteName = "Default Institute";
    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
    }

    // Class method to update the institute name
    public static void updateInstituteName(String newInstituteName) {
        //updating class variable
        instituteName = newInstituteName;
    }

    public static void main(String[] args) {
        // Update the institute name
        Course.updateInstituteName("CAPTRAINING");
        // Create Course objects
        Course course1 = new Course("Capgemini", 12, 500.00);
        Course course2 = new Course("Java", 16, 700.00);
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
    }
}
