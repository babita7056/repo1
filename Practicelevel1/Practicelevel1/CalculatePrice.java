//Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
package Practicelevel1;
import java.util.Scanner;
public class CalculatePrice {
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the unit price of the item: ");
    double unitPrice = sc.nextDouble();     
    System.out.print("Enter the quantity to be bought: ");
    int quantity = sc.nextInt();
    double totalPrice = unitPrice * quantity;
    System.out.println("The total price is: " + totalPrice);
}
}
