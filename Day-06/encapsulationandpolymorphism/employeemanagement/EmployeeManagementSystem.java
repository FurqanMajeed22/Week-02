package encapsulationandpolymorphism.employeemanagement;



// Main class to test the system
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating employee objects
        FullTimeEmployee ftEmployee = new FullTimeEmployee(101, "Furqan Majeed", 50000, 60000);
        PartTimeEmployee ptEmployee = new PartTimeEmployee(102, "Anubhav Singh", 20000, 20, 25);

        // Assigning departments
        ftEmployee.assignDepartment("IT");
        ptEmployee.assignDepartment("Marketing");

        // Displaying details
        Employee[] employees = {ftEmployee, ptEmployee};
        for (Employee employee : employees) {
            employee.displayDetails();
            if (employee instanceof Department) {
                ((Department) employee).getDepartmentDetails();
            }
            System.out.println();
        }
    }
}
