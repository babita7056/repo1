//14.Write a Program to find the factorial of an integer entered by the user.

package practice.Level1Practice;
import java.util.Scanner;
public class FactorialOfInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        int factorial = 1;
        int i = 1;
        while (i <= number) {
            factorial *= i;
            i++;
        }
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
    
}
