class Student {
    private String name;
    private int rollNumber;
    private int marks;
    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    // Method to calculate grade based on marks
    public String calculateGrade() {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B+";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 50) {
            return "C+";
        } else if (marks >= 40) {
            return "C";
        } else {
            return "F";
        }
    }
    public void displayDetails() {
        String grade = calculateGrade();
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Furqan Majeed", 101, 85);
        student1.displayDetails();

        Student student2 = new Student("Anubhav Singh", 102, 72);
        student2.displayDetails();
    }
}
