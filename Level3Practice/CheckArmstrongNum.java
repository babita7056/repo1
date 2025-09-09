//5.Create a program to check if a number is armstrong or not. Use the hints to show the steps clearly in the code
package Level3Practice;
import java.util.Scanner;
public class CheckArmstrongNum {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter a positive integer: ");
      int number = scanner.nextInt();
      int originalNumber = number;
      int sum = 0;
      while (originalNumber != 0) {
          int digit = originalNumber % 10;
          sum += digit * digit * digit;
          originalNumber /= 10;
      }
      if (sum == number) {
          System.out.println(number + " is an Armstrong number.");
      } else {
          System.out.println(number + " is not an Armstrong number.");
      }
  }  
}
