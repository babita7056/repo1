//4.Write a Program to check if the given number is a prime number or not

package Level3Practice;
import java.util.Scanner;
public class CheckPrimeNUmber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false; // Found a divisor, not a prime number
                    break;
                }
            }
        }

        System.out.println("Is the number " + number + " a prime number? " + isPrime);
    }
}
