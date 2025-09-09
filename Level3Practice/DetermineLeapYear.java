//2.Rewrite program 1 to determine Leap Year with single if condition using logical and && and or || operators
package Level3Practice;
import java.util.Scanner;
public class DetermineLeapYear {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a year (>= 1582): ");
       int year = scanner.nextInt();
       if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
           System.out.println(year + " is a Leap Year.");
       } else if (year >= 1582) {
           System.out.println(year + " is not a Leap Year.");
       } else {
           System.out.println("The input year is not valid for the Gregorian calendar.");
       }
   } 
}
