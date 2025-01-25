package hierarchicalinheritence.schoolsystem;
public class SchoolSystem {
    public static void main(String[] args) {
        Person person = new Person("ABC", 25);
        Teacher teacher = new Teacher("Furqan", 22, "Math");
        Student student = new Student("Om", 18, 12);
        Staff staff = new Staff("Staff 1", 30, "Developer");

        person.displayRole();
        System.out.println();

        teacher.displayRole();
        System.out.println();

        student.displayRole();
        System.out.println();

        staff.displayRole();
    }
}