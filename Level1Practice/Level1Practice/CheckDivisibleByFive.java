//Write a program to check if a number is divisible by 5
// I/P => number
// O/P => Is the number ___ divisible by 5? ___

package practice.Level1Practice;
import java.util.Scanner;
public class CheckDivisibleByFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=scanner.nextInt();
        boolean isDivisibleBy5 = (number % 5 == 0);
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisibleBy5);       
      
    }
}
