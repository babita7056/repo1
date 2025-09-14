//9.Write a program to take user input for 5 numbers and check whether a number is positive or negative. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they are equal, greater, or less
package MethodLevel2;
import java.util.Scanner;
public class CheckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        for (int number : numbers) {
            if (isPositive(number)) {
                if (isEven(number)) {
                    System.out.println(number + " is positive and even.");
                } else {
                    System.out.println(number + " is positive and odd.");
                }
            } else {
                System.out.println(number + " is negative.");
            }
        }

        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);
        if (comparisonResult == 1) {
            System.out.println("The first number (" + numbers[0] + ") is greater than the last number (" + numbers[numbers.length - 1] + ").");
        } else if (comparisonResult == -1) {
            System.out.println("The first number (" + numbers[0] + ") is less than the last number (" + numbers[numbers.length - 1] + ").");
        } else {
            System.out.println("The first number (" + numbers[0] + ") is equal to the last number (" + numbers[numbers.length - 1] + ").");
        }

        scanner.close();
    }

    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 < num2) {
            return -1;
        } else {
            return 0;
        }
    }
    
}
