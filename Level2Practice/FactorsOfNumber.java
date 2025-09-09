//8.Rewrite the above program 7 to find the factors of a number using the while loop

package Level2Practice;
import java.util.Scanner;
public class FactorsOfNumber {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a positive integer: ");
       int number = scanner.nextInt();
       if (number > 0) {
           System.out.println("The factors of " + number + " are:");
           int i = 1;
           while (i <= number) {
               if (number % i == 0) {
                   System.out.println(i);
               }
               i++;
           }
       } else {
           System.out.println("The input is not a positive integer.");
       }
   } 
}
