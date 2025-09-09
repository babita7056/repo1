//9.Rewrite program 8 to do the countdown using the for-loop
package practice.Level1Practice;
import java.util.Scanner;
public class CountDownNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int counter = scanner.nextInt();
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Rocket Launch!");
    }
}
