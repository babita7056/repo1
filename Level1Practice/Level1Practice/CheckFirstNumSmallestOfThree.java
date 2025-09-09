//2.Write a program to check if the first is the smallest of the 3 numbers
// I/P => number1, number2, number3
// O/P => Is the first number the smallest? ____

package practice.Level1Practice;
import java.util.Scanner;
public class CheckFirstNumSmallestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        boolean FirstSmallest = (num1 < num2) && (num1 < num3);
        System.out.println("Is the first number the smallest? " + FirstSmallest);
    }
}
