import java.util.ArrayList;
import java.util.List;

// Employee class
 public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Department class composed within Company
class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String employeeName) {
        employees.add(new Employee(employeeName));
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public String getName() {
        return name;
    }
}

// Company class contains Departments
class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    public void addEmployeeToDepartment(String departmentName, String employeeName) {
        for (Department department : departments) {
            if (department.getName().equals(departmentName)) {
                department.addEmployee(employeeName);
                return;
            }
        }
        System.out.println("Department not found: " + departmentName);
    }

//    public void showCompanyStructure() {
//        System.out.println("Company: " + name);
//        for (Department department : departments) {
//            System.out.println("  Department: " + department.getName());
//            for (Employee employee : department.getEmployees()) {
//                System.out.println("    Employee: " + employee.getName());
//            }
        //}
    //}

    // Cleanup method to simulate object deletion
    public void deleteCompany() {
        departments.clear();
        System.out.println("Company " + name + " and all its departments and employees are deleted.");
    }
}

public class COM {
    public static void main(String[] args) {
        Company company = new Company("TechCorp");

        company.addDepartment("IT");
        company.addDepartment("HR");

        company.addEmployeeToDepartment("IT", "Alice");
        company.addEmployeeToDepartment("IT", "Bob");
        company.addEmployeeToDepartment("HR", "Charlie");

        company.showCompanyStructure();

        // Delete the company Composition ensures all related objects are deleted
        company.deleteCompany();
    }
}
