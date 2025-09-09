//8.Write a program to count down the number from the user input value to 1 using a while loop for a rocket launch
package practice.Level1Practice;
import java.util.Scanner;
public class CounDownTheNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int counter = scanner.nextInt();
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Rocket Launch!");
    }
    
}
