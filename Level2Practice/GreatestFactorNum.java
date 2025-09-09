//10.Rewrite the above program to print the greatest factor of a number beside itself using a while loop.

package Level2Practice;
import java.util.Scanner;
public class GreatestFactorNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        int greatestFactor = 1;
        if (number > 0) {
            int counter = number - 1;
            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break;
                }
                counter--;
            }
            System.out.println("The greatest factor of " + number + " beside itself is: " + greatestFactor);
        } else {
            System.out.println("The input is not a positive integer.");
        }
    }
}
