//1.Description: Build an employee management system 
package EncapsulationAndPolymorphism;
abstract  class Employee implements Department {
    private int employeeId;
    private String name;
    private double baseSalary;
    private String department;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Salary: " + calculateSalary());
    }
    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }
    @Override
    public void getDepartmentDetails() {
        System.out.println("Department: " + department);
    }
}
class FullTimeEmployee extends Employee {
    private double allowance;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double allowance) {
        super(employeeId, name, baseSalary);
        this.allowance = allowance;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + allowance;
    }
}   
class PartTimeEmployee extends Employee {
   private int hoursWorked;
   private double hoursRate;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, double hoursRate, int hoursWorked) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hoursRate = hoursRate;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + hoursWorked * hoursRate;
    }
}
interface Department {
    void assignDepartment(String department);
    void getDepartmentDetails();
}
 public class EmployeeManagement{
    public static void main(String[] args) {
        Employee e1=new FullTimeEmployee(101,"alice",40000,5000);
        Employee e2=new PartTimeEmployee(102,"bob",30000,25,40);
        e1.assignDepartment("IT");
        e2.assignDepartment("HR");
       Employee[] employees = {e1, e2};

        for (Employee employee : employees) {
            employee.displayDetails();
        }
    }
 }

