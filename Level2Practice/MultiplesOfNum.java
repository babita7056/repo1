//13.Rewrite the program to find all the multiples of a number below 100 using while loop.
package Level2Practice;
import java.util.Scanner;
public class MultiplesOfNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int number = scanner.nextInt();
        if (number > 0 && number < 100) {
            System.out.println("The multiples of " + number + " below 100 are:");
            int counter = 100;
            while (counter >= 1) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        } else {
            System.out.println("The input is not a positive integer less than 100.");
        }
    }
}
