//6.Create a program to count the number of digits in an integer.

package Level3Practice;
import java.util.Scanner;
public class CountTheNumOfDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        if (number > 0) {
            int count = 0;
            while (number != 0) {
                number /= 10; // Remove the last digit
                count++;      // Increase count by 1
            }
            System.out.println("The number of digits is: " + count);
        } else {
            System.out.println("The input is not a positive integer.");
        }
    }
}
