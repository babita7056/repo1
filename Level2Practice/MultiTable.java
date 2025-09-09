//3.Create a program to find the multiplication table of a number entered by the user from 6 to 9.
package Level2Practice;

import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        for (int i = 6; i <= 9; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }}
}
