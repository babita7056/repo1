//5.University Student Management
package KeywordsAndInstanceofLevel1;

public class Student {
    static String universityName = "ABC University";
    String name;
    final int rollNumber;
    String grade;
    static int numberofStudents=0;
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        numberofStudents++; 
    }
    public void display() {
        if(this instanceof Student){
        System.out.println("University Name: " + universityName);
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
}
    public static void displayTotalStudents() {
        System.out.println("Total number of students: " + numberofStudents);
    }
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 101, "A");
        Student student2 = new Student("Bob", 102, "B");
        Student student3 = new Student("Charlie", 103, "C");
        student1.display();
        student2.display();
        student3.display();
        displayTotalStudents();
    }
}
