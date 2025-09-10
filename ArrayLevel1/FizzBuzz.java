//10.Write a program FizzBuzz, take a number as user input and if it is a positive integer loop from 0 to the number and save the number, 

package ArrayLevel1;
import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer greater than 0.");
            scanner.close();
            return;
        }

        String[] fizzBuzzArray = new String[number];

        for (int i = 0; i < number; i++) {
            int currentNum = i + 1;
            if (currentNum % 3 == 0 && currentNum % 5 == 0) {
                fizzBuzzArray[i] = "FizzBuzz";
            } else if (currentNum % 3 == 0) {
                fizzBuzzArray[i] = "Fizz";
            } else if (currentNum % 5 == 0) {
                fizzBuzzArray[i] = "Buzz";
            } else {
                fizzBuzzArray[i] = String.valueOf(currentNum);
            }
        }

        System.out.println("FizzBuzz results:");
        for (int i = 0; i < fizzBuzzArray.length; i++) {
            System.out.println("Position " + (i + 1) + " = " + fizzBuzzArray[i]);
        }

        scanner.close();
    }
}
