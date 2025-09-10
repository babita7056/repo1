//4.Write a program to store multiple values in an array up to a maximum of 10 or until the user enters a 0 or a negative number. Show all the numbers as well as the sum of all numbers 

package ArrayLevel1;
import java.util.Scanner;
public class StoreValUtil0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = scanner.nextDouble();

            if (input <= 0 || index >= 10) {
                break;
            }

            numbers[index] = input;
            index++;
        }

        System.out.println("You entered the following numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        System.out.println("The sum of all entered numbers is: " + total);
        scanner.close();
    }
}
