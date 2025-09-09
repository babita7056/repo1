//10.Write a program to find the sum of numbers until the user enters 0

package practice.Level1Practice;
import java.util.Scanner;
public class SumOfNumUntil0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            double number = scanner.nextDouble();
            if (number == 0) {
                break;
            }
            total += number;
        }
        System.out.println("The sum of the numbers entered is: " + total);
    }
}
