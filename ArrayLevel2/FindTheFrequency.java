//10.Create a program to take a number as input find the frequency of each digit in the number using an array and display the frequency of each digi

package ArrayLevel2;
import java.util.Scanner;
public class FindTheFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Error: Please enter a positive integer.");
            scanner.close();
            return;
        }

        String numStr = Integer.toString(number);
        int numDigits = numStr.length();
        int[] digits = new int[numDigits];

        for (int i = 0; i < numDigits; i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }

        int[] frequency = new int[10];

        for (int digit : digits) {
            frequency[digit]++;
        }

        System.out.println("Digit frequencies in the number " + number + ":");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " time(s)");
            }
        }

        scanner.close();
    }   
}
