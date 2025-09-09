//8.Create a program to check if a number taken from the user is a Harshad Number.
package Level3Practice;
import java.util.Scanner;
public class CheckHarshadNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int sum = 0;
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum += digit;
            originalNumber /= 10;
        }
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad number.");
        } else {
            System.out.println(number + " is not a Harshad number.");
        }
    }
}