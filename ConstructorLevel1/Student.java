//1.Create a Student class with:rollNumber (public).name (protected).CGPA (private).Write methods to:Access and modify CGPA using public methods.Create a subclass PostgraduateStudent to demonstrate the use of protected members.
package ConstructorLevel1;
public class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;
    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;  
    }
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
    public double getCGPA() {
        return CGPA;
    }
    public void displayStudent() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}
class PostgraduateStudent extends Student {
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }
    public void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);  
    }
    public static void main(String[] args) {
        Student s1= new Student(1, "John", 3.5);
        s1.displayStudent();
        s1.setCGPA(3.7);
        System.out.println("updated CGPA: " + s1.getCGPA());
        PostgraduateStudent obj = new PostgraduateStudent(2, "bob", 3.8);
        obj.display();
        obj.displayStudent();

    }
}
    

