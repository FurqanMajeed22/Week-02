package multilevelinheritence.coursesystem;

public class CourseSystem {
    public static void main(String[] args) {
        Course course = new Course("Java", 30);
        OnlineCourse onlineCourse = new OnlineCourse("Java", 40, "Udemy", true);
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("C++", 50, "Code Help", false, 20000, 20);

        course.displayInfo();
        onlineCourse.displayInfo();
        paidOnlineCourse.displayInfo();
    }
}