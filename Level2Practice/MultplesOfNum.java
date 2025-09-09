//11.Create a program to find all the multiples of a number taken as user input below 100.
package Level2Practice;
import java.util.Scanner;   
public class MultplesOfNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int number = scanner.nextInt();
        if (number > 0 && number < 100) {
            System.out.println("The multiples of " + number + " below 100 are:");
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("The input is not a positive integer less than 100.");
        }
    }
}
