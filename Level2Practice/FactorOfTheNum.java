//7.Create a program to find the factors of a number taken as user input.
package Level2Practice;
import java.util.Scanner;
public class FactorOfTheNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("The factors of " + number + " are:");
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("The input is not a positive integer.");
        }
    }
}
