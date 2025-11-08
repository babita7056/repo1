package LinkedList;

 class Node {
    int rollNumber;
    String name;
    int age;
    char grade;
    Node next;
    public Node(int rollNumber, String name, int age, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}
class StudentLinkedList {
    private Node head;
    public void addFirst(int rollNumber, String name, int age, char grade) {
        Node newStudent = new Node(rollNumber, name, age, grade);
        newStudent.next = head;
        head = newStudent;
    }
    public void addLast(int rollNumber, String name, int age, char grade) {
        Node newStudent = new Node(rollNumber, name, age, grade);
        if (head == null) {
            head = newStudent;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newStudent;
    }
    public void delete(int rollNumber) {
        if (head == null) {
            return;
        }
        if (head.rollNumber == rollNumber) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.rollNumber == rollNumber) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
    
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.println("Roll Number " + current.rollNumber + "-> Name " + current.name +"-> Age" + current.age + "->Grade" + current.grade);
            current = current.next;
        }
    }

}
public class Student {
    public static void main(String[] args) {
        StudentLinkedList studentList = new StudentLinkedList();
        studentList.addLast(1, "Alice", 20, 'A');
        studentList.addLast(2, "Bob", 21, 'B');
        studentList.addFirst(3, "Charlie", 19, 'C');
        studentList.display();
        System.out.println("After deleting roll number 2:");
        studentList.delete(2);
        studentList.display();

    }
}