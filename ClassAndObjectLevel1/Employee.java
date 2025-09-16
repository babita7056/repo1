//1.Program to Display Employee Details
package ClassAndObjectLevel1;
import java.util.Scanner;
public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int Id = sc.nextInt();
        System.out.print("Enter Employee Name: ");
        String Name = sc.next();
        System.out.print("Enter Employee Salary: ");
        double Salary = sc.nextDouble();
        Employee empl= new Employee();
        empl.DetailOfemployee(Id, Name, Salary);
        sc.close();
    }
    public void DetailOfemployee(int Id, String Name, double Salary) {
        System.out.println("Employee ID: " + Id);
        System.out.println("Employee Name: " + Name);
        System.out.println("Employee Salary: " + Salary);
    }
}
