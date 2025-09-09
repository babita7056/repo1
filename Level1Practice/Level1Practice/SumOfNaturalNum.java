//12.Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 

package practice.Level1Practice;
import java.util.Scanner;
public class SumOfNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();
        if (number >= 1) {
            int sumUsingFormula = number * (number + 1) / 2;
            int sumUsingLoop = 0;
            int i = 1;
            while (i <= number) {
                sumUsingLoop += i;
                i++;
            }
            System.out.println("Sum using formula: " + sumUsingFormula);
            System.out.println("Sum using loop: " + sumUsingLoop);
            if (sumUsingFormula == sumUsingLoop) {
                System.out.println("Both computations are correct and equal.");
            } else {
                System.out.println("There is a discrepancy between the two computations.");
            }
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
        
    }
}
