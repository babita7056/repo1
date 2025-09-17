//4.Develop an Employee class with:employeeID (public).department (protected).salary (private).Write methods to:Modify salary using a public method.Create a subclass Manager to access employeeID and department.
package ConstructorLevel1;
class Employee {
    public int employeeID;        
    protected String department;  
    private double salary;        

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be positive.");
        }
    }
    public double getSalary() {
        return salary;
    }
    public void displayEmployee() {
        System.out.println("Employee ID: " + employeeID +", Department: " + department +", Salary: " + salary);
    }
}
class Manager extends Employee {
    private int teamSize;

    public Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    public void displayManagerDetails() {
        System.out.println("Manager ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Manager Salary: " + getSalary());
    }
}

public class CompanySystem {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "HR", 45000.0);
        e1.displayEmployee();
        e1.setSalary(50000.0);
        System.out.println("Updated Salary: " + e1.getSalary());

        System.out.println();

        Manager m1 = new Manager(201, "IT", 80000.0, 10);
        m1.displayManagerDetails();
    }
}

