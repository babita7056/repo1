//2.Write a program to find the sum of n natural numbers using recursive method and compare the result with the formulae n*(n+1)/2 and show the result from both computations is correct. 
package MethodLevel2;
import java.util.Scanner;
public class SumOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();
        
        if (number <= 0) {
            System.out.println("Invalid input. Please enter a natural number greater than 0.");
            scanner.close();
            return;
        }
        
        int sumRecursive = sumOfNaturalNumbers(number);
        int sumFormula = sumUsingFormula(number);
        
        System.out.println("Sum of first " + number + " natural numbers using recursion: " + sumRecursive);
        System.out.println("Sum of first " + number + " natural numbers using formula: " + sumFormula);
        
        if (sumRecursive == sumFormula) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("The results are different.");
        }
        
        scanner.close();
    }
    public static int sumOfNaturalNumbers(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfNaturalNumbers(n - 1);
    }
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }
}
