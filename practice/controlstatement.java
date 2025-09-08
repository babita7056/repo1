//// Demonstration of control statements in Java
/// //conditional statements in java
package practice;
import java.util.Scanner;
public class controlstatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // If-Else Statement
        System.out.println("Enter an integer for If-Else demonstration:");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }

        // Switch Statement
        System.out.println("\nEnter a number (1-7) to get the corresponding day of the week:");
        int day = scanner.nextInt();
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }
//loops in java
        // For Loop
        System.out.println("\nFor Loop: Print numbers from 1 to 5");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // While Loop
        System.out.println("\nWhile Loop: Print numbers from 1 to 5");
        int j = 1;
        while (j <= 5) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println();

        // Do-While Loop
        System.out.println("\nDo-While Loop: Print numbers from 1 to 5");
        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= 5);
        System.out.println();
//jump statements in java
        // Break and Continue
        System.out.println("\nBreak and Continue in a For Loop:");
        for (int m = 1; m <= 10; m++) {
            if (m == 6) {
                System.out.println("Breaking the loop at m = " + m);
                break; // Exit the loop when m is 6
            }
            if (m % 2 == 0) {
                continue; // Skip even numbers
            }
}
    }
}
