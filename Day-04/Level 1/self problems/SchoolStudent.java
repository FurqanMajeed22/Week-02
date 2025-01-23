import java.util.ArrayList;
import java.util.List;
class School {
    private String name;
    private List<Student> students;
    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }
    public void listStudents() {
        System.out.println("Students in " + name + ":");
        for (Student student : students) {
            System.out.println( student.getName());
        }
    }
}

class Student {
    private String name;
    private List<Course> enrolledCourses;
    public Student(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    public void enrollInCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            course.addStudent(this);
        }
    }

    public void viewEnrolledCourses() {
        System.out.println(name + " is enrolled in the following courses:");
        for (Course course : enrolledCourses) {
            System.out.println(course.getName());
        }
    }

    public String getName() {
        return name;
    }
}

class Course1 {
    private String name;
    private List<Student> enrolledStudents;

    public Course1(String name) {
        this.name = name;
        this.enrolledStudents = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
        }
    }

    public void showEnrolledStudents() {
        System.out.println("Students enrolled in " + name + ":");
        for (Student student : enrolledStudents) {
            System.out.println(student.getName());
        }
    }

    public String getName() {
        return name;
    }
}



public class SchoolStudent {
    public static void main(String[] args) {
        School school = new School("Capgemini");

        Student s1 = new Student("Furqan Majeed");
        Student s2 = new Student("Anubhav Singh");

        school.addStudent(s1);
        school.addStudent(s2);

        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        s1.enrollInCourse(math);
        s1.enrollInCourse(science);
        s2.enrollInCourse(math);

        s1.viewEnrolledCourses();
        s2.viewEnrolledCourses();

        math.showEnrolledStudents();
        science.showEnrolledStudents();

        school.listStudents();
    }
}