//1.Program to Simulate Student Report
package ClassAndObjectLevel2;
import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        String name=sc.next();
        System.out.println("Enter Student Roll Number: ");
        double roll=sc.nextDouble();
        System.out.println("Enter Student Marks: ");
        int marks=sc.nextInt();
        Student obj=new Student();
        obj.displayStudentGrade(name,roll,marks);
        obj.calculateTheGrade(marks);
        sc.close();
    }
    public void calculateTheGrade(int marks){
        if(marks>=90){
            System.out.println("Grade A");
        }
        else if(marks>=75){
            System.out.println("Grade B");
        }
        else if(marks>=65){
            System.out.println("Grade C");
        }
        else if(marks>=45 ){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Grade F");
        }
        
    }
    public void displayStudentGrade(String name,double roll,int marks){
        System.out.println("Name: "+name);
        System.out.println("Roll Number: "+roll);
        System.out.println("Marks: "+marks);
    }
}
