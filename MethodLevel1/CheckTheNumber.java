//5.Write a program to check whether a number is positive, negative, or zero.
import java.util.Scanner;
public class CheckTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int result = checkNumber(number);
        
        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        
        scanner.close();
    }
    public static int checkNumber(int num) {
        if (num > 0) {
            return 1; 
        } else if (num < 0) {
            return -1; 
        } else {
            return 0; 
        }
    }
}
