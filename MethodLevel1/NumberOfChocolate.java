//10.Create a program to divide N number of chocolates among M children. Print the number of chocolates each child will get and also the remaining chocolates

import java.util.Scanner; 
public class NumberOfChocolate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        if (numberOfChildren <= 0) {
            System.out.println("Error: Number of children must be greater than zero.");
        } else {
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
            System.out.println("Each child will get " + result[0] + " chocolates.");
            System.out.println("Remaining chocolates: " + result[1]);
        }

        scanner.close();
    }
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        int chocolatesPerChild = numberOfChocolates / numberOfChildren; 
        int remainingChocolates = numberOfChocolates % numberOfChildren; 
        return new int[]{chocolatesPerChild, remainingChocolates}; 
    }
}
