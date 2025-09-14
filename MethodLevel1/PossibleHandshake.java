//3.Create a program to find the maximum number of handshakes among N number of students.
import java.util.Scanner;
public class PossibleHandshake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        
        if (numberOfStudents < 2) {
            System.out.println("At least two students are required for handshakes.");
        } else {
            int possibleHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
            System.out.println("The maximum number of possible handshakes among " + numberOfStudents + " students is: " + possibleHandshakes);
        }
        
        scanner.close();
    }
}
