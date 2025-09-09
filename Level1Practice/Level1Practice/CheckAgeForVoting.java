//5.Write a program to check whether a person can vote, depending on whether his/her age is greater than or equal to 18.Hint => Get integer input from the user and store it in the age variable.
package practice.Level1Practice;
import java.util.Scanner;
public class CheckAgeForVoting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
    }
    
}
