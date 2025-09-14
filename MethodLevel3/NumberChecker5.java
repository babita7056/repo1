//6.Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods.

package MethodLevel3;
import java.util.Scanner;
public class NumberChecker5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Error: Please enter a positive integer.");
            scanner.close();
            return;
        }

        int[] factors = findFactors(number);
        System.out.print("Factors array: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        int greatestFactor = findGreatestFactor(factors);
        System.out.println("Greatest Factor: " + greatestFactor);

        int sumOfFactors = sumOfFactors(factors);
        System.out.println("Sum of Factors: " + sumOfFactors);

        int productOfFactors = productOfFactors(factors);
        System.out.println("Product of Factors: " + productOfFactors);

        double productOfCubes = productOfCubesOfFactors(factors);
        System.out.println("Product of Cubes of Factors: " + productOfCubes);

        boolean isPerfect = isPerfectNumber(number, sumOfFactors);
        System.out.println("Is Perfect Number: " + isPerfect);

        boolean isAbundant = isAbundantNumber(number, sumOfFactors);
        System.out.println("Is Abundant Number: " + isAbundant);

        boolean isDeficient = isDeficientNumber(number, sumOfFactors);
        System.out.println("Is Deficient Number: " + isDeficient);

        boolean isStrong = isStrongNumber(number);
        System.out.println("Is Strong Number: " + isStrong);

        scanner.close();
    }
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }
    public static int findGreatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
    public static double productOfCubesOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }
    public static boolean isPerfectNumber(int number, int sumOfFactors) {
        return sumOfFactors - number == number;
    }
    public static boolean isAbundantNumber(int number, int sumOfFactors) {
        return sumOfFactors - number > number;
    }
    public static boolean isDeficientNumber(int number, int sumOfFactors) {
        return sumOfFactors - number < number;
    }
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

}
