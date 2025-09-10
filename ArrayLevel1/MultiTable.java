// 5.Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result

package ArrayLevel1;
import java.util.Scanner;
public class MultiTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to print its multiplication table from 6 to 9: ");
        int number = scanner.nextInt();
        int[] multiplicationResult = new int[4]; 

        for (int i = 0; i < multiplicationResult.length; i++) {
            multiplicationResult[i] = number * (i + 6); 
        }

        System.out.println("Multiplication table of " + number + " from 6 to 9:");
        for (int i = 0; i < multiplicationResult.length; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
        }

        scanner.close();
    }
}
