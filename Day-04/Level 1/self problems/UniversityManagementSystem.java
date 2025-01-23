import java.util.ArrayList;

class Student {
    String studentName;
    ArrayList<Course> courses;
    Student(String studentName) {
        this.studentName = studentName;
        this.courses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);  // Ensures bidirectional relationship
    }

    public void showCourses() {
        for (Course c : courses) {
            System.out.println("Student " + this.studentName + " is enrolled in " + c.courseName);
        }
    }
}

class Professor {
    String professorName;
    ArrayList<Course> courses;

    Professor(String professorName) {
        this.professorName = professorName;
        this.courses = new ArrayList<>();
    }

    public void assignProfessor(Course course) {
        courses.add(course);
        course.assignProfessor(this);  // Ensures bidirectional relationship
    }

    public void showCourses() {
        System.out.println(professorName + " is teaching the following courses:");
        for (Course course : courses) {
            System.out.println(course.courseName);
        }
    }
}

class Course {
    String courseName;
    Professor professor;
    ArrayList<Student> students;

    Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }
    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showProfessor() {
        if (professor != null) {
            System.out.println("Course " + this.courseName + " is assigned to Professor " + professor.professorName);
        } else {
            System.out.println("Course " + this.courseName + " has no professor assigned.");
        }
    }

    public void showStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : students) {
            System.out.println(student.studentName);
        }
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {

        Student student1 = new Student("Deepansh");
        Student student2 = new Student("Anubhav");
        Student student3 = new Student("Mayank");

        Course course1 = new Course("Java Full Stack");
        Course course2 = new Course("Web Development");
        Course course3 = new Course("AI");

        Professor professor1 = new Professor("ABC");
        Professor professor2 = new Professor("XYZ");
        Professor professor3 = new Professor("IJK");

        student1.enrollCourse(course1);
        student2.enrollCourse(course2);
        student3.enrollCourse(course3);

        professor1.assignProfessor(course1);
        professor2.assignProfessor(course2);
        professor3.assignProfessor(course3);

        student1.showCourses();
        student2.showCourses();
        student3.showCourses();

        course1.showProfessor();
        course2.showProfessor();
        course3.showProfessor();

        course1.showStudents();
        course2.showStudents();
        course3.showStudents();

        professor1.showCourses();
        professor2.showCourses();
        professor3.showCourses();
    }
}
