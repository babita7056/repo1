//9.Create a program to print the greatest factor of a number beside itself using a loop.

package Level2Practice;
import java.util.Scanner;
public class GretestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        int greatestFactor = 1;
        if (number > 0) {
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break;
                }
            }
            System.out.println("The greatest factor of " + number + " beside itself is: " + greatestFactor);
        } else {
            System.out.println("The input is not a positive integer.");
        }
    }
}
