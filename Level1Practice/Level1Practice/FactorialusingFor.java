//15.Rewrite program 14 using for loop
package practice.Level1Practice;
import java.util.Scanner;
public class FactorialusingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        if (number >= 0) {
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("The factorial of " + number + " is " + factorial);
        } else {
            System.out.println("Factorial is not defined for negative numbers.");
        }
    }
}
