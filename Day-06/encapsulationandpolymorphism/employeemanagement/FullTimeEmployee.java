package encapsulationandpolymorphism.employeemanagement;


// FullTimeEmployee class extending Employee and implementing Department
class FullTimeEmployee extends Employee implements Department {
    private double fixedSalary;
    private String department;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double fixedSalary) {
        super(employeeId, name, baseSalary);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double calculateSalary() {
        return fixedSalary;  // Full-time employees get a fixed salary
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public void getDepartmentDetails() {
        System.out.println("Department: " + department);
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }
}
