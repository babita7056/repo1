//  //Write a program that takes your height in centimeters and converts it into feet and inches
package Practicelevel1;
import java.util.Scanner;
public class Convertintofeet {
  
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your height in centimeters: ");
    double cm = sc.nextDouble();
    double inches = cm / 2.54;
    int feet = (int) inches / 12;
    inches = inches % 12;
    System.out.println("Your height is " + feet + " feet and " + inches + " inches.");
}
}
