//7.Write a program to find the sum of n natural numbers using loop
import java.util.Scanner;
public class SumOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        
        if (n < 1) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            int sum = calculateSum(n);
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }
        
        scanner.close();
    }
    public static int calculateSum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i; // Add each number to the sum
        }
        return sum;
    }
}
