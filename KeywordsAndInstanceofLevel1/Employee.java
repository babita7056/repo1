//3. Employee Management System
package KeywordsAndInstanceofLevel1;

public class Employee {
    static String companyName="ABC Company";
    String name;
    final int id;
    String designation;
  static double totalNumberofemployees=0;
    
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalNumberofemployees++;
    }
    public static void displayTotalemployees() {
        System.out.println("Total number of employees: " + totalNumberofemployees);
    }
    public void display() {
        if(this instanceof Employee){
        System.out.println("Company Name: " + companyName);   
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + designation);
    }
}
public static void main(String[] args) {
    Employee employee1 = new Employee("John", 1, "Manager");
    employee1.display();
    Employee employee2 = new Employee("Jane", 2, "Developer");
    employee2.display();
    Employee.displayTotalemployees();
    
}
}
