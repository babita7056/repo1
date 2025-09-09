//1.Write a LeapYear program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year. 
package Level3Practice;
import java.util.Scanner;
public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();
        if (year >= 1582) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("The input year is not valid for the Gregorian calendar.");
        }
    }
}
