//2.Create a program to find the maximum number of handshakes among N number of students.
import java.util.Scanner;
public class MaxHandshake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        
        if (n < 2) {
            System.out.println("At least two students are required for handshakes.");
        } else {
            int maxHandshakes = (n * (n - 1)) / 2;
            System.out.println("The maximum number of handshakes among " + n + " students is: " + maxHandshakes);
        }
        
        scanner.close();
    }
}
