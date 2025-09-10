//3.Create a program to print a multiplication table of a number.

package ArrayLevel1;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to print its multiplication table: ");
        int number = scanner.nextInt();
        int[] MultiplicationTableTable = new int[10];

        for (int i = 0; i < MultiplicationTableTable.length; i++) {
            MultiplicationTableTable[i] = number * (i + 1);
        }

        System.out.println("Multiplication table of " + number + ":");
        for (int i = 0; i < MultiplicationTableTable.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + MultiplicationTableTable[i]);
        }

        scanner.close();
    }
}
