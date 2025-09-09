//3.Write a program to check if the first, second, or third number is the largest of the three.
package practice.Level1Practice;
import java.util.Scanner;
public class LargestOfThreeNum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        boolean FirstLargest = (num1 > num2) && (num1 > num3);
        boolean SecondLargest = (num2 > num1) && (num2 > num3);
        boolean ThirdLargest = (num3 > num1) && (num3 > num2);

        System.out.println("Is the first number the largest? " + FirstLargest);
        System.out.println("Is the second number the largest? " + SecondLargest);
        System.out.println("Is the third number the largest? " + ThirdLargest);
    }
}
