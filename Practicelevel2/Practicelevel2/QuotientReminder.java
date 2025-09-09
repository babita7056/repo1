 //Write a program to take 2 numbers and print their quotient and reminder
package Practicelevel2;
import java.util.Scanner;   
public class QuotientReminder {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number (dividend): ");
        int dividend = sc.nextInt();
        System.out.print("Enter the second number (divisor): ");
        int divisor = sc.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("The quotient is: " + quotient);
        System.out.println("The remainder is: " + remainder);
    }
}
