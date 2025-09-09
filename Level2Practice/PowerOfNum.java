//12.Create a program to find the power of a number.

package Level2Practice;
import java.util.Scanner;
public class PowerOfNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer as the base number: ");
        int number = scanner.nextInt();
        System.out.print("Enter a positive integer as the exponent (power): ");
        int power = scanner.nextInt();
        if (number > 0 && power >= 0) {
            int result = 1;
            for (int i = 1; i <= power; i++) {
                result *= number;
            }
            System.out.println(number + " raised to the power of " + power + " is: " + result);
        } else {
            System.out.println("The input is not a positive integer.");
        }
    }
}
