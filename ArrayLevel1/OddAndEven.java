//7.Create a program to save odd and even numbers into odd and even arrays between 1 to the number entered by the user. Finally, print the odd and even numbers array

package ArrayLevel1;
import java.util.Scanner;
public class OddAndEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        if (number < 1) {
            System.out.println("Error: Please enter a natural number greater than 0.");
            scanner.close();
            return;
        }

        int evenSize = number / 2 + 1;
        int oddSize = number / 2 + (number % 2 == 0 ? 0 : 1);
        int[] evenNumbers = new int[evenSize];
        int[] oddNumbers = new int[oddSize];
        int evenIndex = 0;
        int oddIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;
            } else {
                oddNumbers[oddIndex++] = i;
            }
        }

        System.out.println("Even numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();

        System.out.println("Odd numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
