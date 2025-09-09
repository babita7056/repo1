//Write a program to find the number of handshakes if there are n people in a room and each person shakes hand with every other person exactly once.
package Practicelevel1;
import java.util.Scanner;
public class NumberOfHandshakes {
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);        
    System.out.print("Enter the number of people ");
    int n = sc.nextInt();
    int handshakes = n * (n - 1) / 2;
    System.out.println("The number of handshakes is: " + handshakes);
}
    
}
