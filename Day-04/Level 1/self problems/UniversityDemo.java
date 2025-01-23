import java.util.ArrayList;
import java.util.List;
// University class Composition: University owns Departments
class University {
    private String name;
    private List<Department> departments;
    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }
    public void addDepartment(Department department) {
        departments.add(department);
    }
    public void listDepartments() {
        System.out.println("Departments in " + name + " University:");
        for (Department d : departments) {
               System.out.println(d.getName());
            d.listFaculty();
        }
    }
    public void closeUniversity() {
        System.out.println("Closing " + name + " University and removing all departments");
        departments.clear();
    }
}
// Department class Composition: Part of a University
class Department {
    private String name;
    private List<Faculty> facultyMembers;

    public Department(String name) {
        this.name = name;
        this.facultyMembers = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    public String getName() {
        return name;
    }

    public void listFaculty() {
        System.out.println("Faculty in " + name + " department:");
        for (Faculty f : facultyMembers) {
            System.out.println(f.getName());
        }
    }
}
// Faculty class Aggregation: Faculty can exist independently of Departments
class Faculty {
    private String name;
    public Faculty(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
public class UniversityDemo {
    public static void main(String[] args) {
        Faculty profSyed= new Faculty("Furqan");
        Faculty profDeepansh = new Faculty("Deepansh");
        Department csDepartment = new Department("Computer Science");
        csDepartment.addFaculty(profSyed);
        Department mathDepartment = new Department("Mathematics");
        mathDepartment.addFaculty(profDeepansh);
        University myUniversity = new University("Capgemini");
        myUniversity.addDepartment(csDepartment);
        myUniversity.addDepartment(mathDepartment);
        myUniversity.listDepartments();
        // Demonstrate deletion of the University--> Composition
        myUniversity.closeUniversity();
        myUniversity.listDepartments(); // Should show no departments left
        // Faculty members still exist
        System.out.println("Faculty members exist independently: " + profSyed.getName() + ", " + profDeepansh.getName());
    }
}
