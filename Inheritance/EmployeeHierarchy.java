//2.Employee Management System
package Inheritance;
class Employee {
    String name;
    int id;
    double salary;
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}
class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}
class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
class Intern extends Employee {
    String college;

    Intern(String name, int id, double salary, String college) {
        super(name, id, salary);
        this.college = college;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("College: " + college);
    }
}
public class EmployeeHierarchy {
    public static void main(String[] args) {
        Manager m = new Manager("Alice", 101, 80000, 5);
        Developer d = new Developer("Bob", 102, 60000, "Java");
        Intern i = new Intern("Charlie", 103, 20000, "XYZ University");

        m.displayDetails();
        d.displayDetails();
        i.displayDetails();
    }
}
