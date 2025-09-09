//13.Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers.
package practice.Level1Practice;
import java.util.Scanner;
public class SumOfNatruralN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();
        if (number >= 1) {
            int sum = 0;
            for (int i = 1; i <= number; i++) {
                sum += i;
            }
            System.out.println("The sum of the first " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}
