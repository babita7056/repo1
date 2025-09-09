//11.Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement
package practice.Level1Practice;
import java.util.Scanner;
public class SumOfNumutilNeg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = scanner.nextDouble();
            if (number <= 0) {
                break;
            }
            total += number;
        }
        System.out.println("The sum of the numbers entered is: " + total);
    }
}
