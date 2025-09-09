//Create a program to convert distance in kilometers to miles.

package Practicelevel1;

import java.util.Scanner;

public class ConvertKilometer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double kilometer = sc.nextDouble();
        double miles = kilometer * 0.621371;
        System.out.println(kilometer + " kilometers is equal to " + miles + " miles.");
    }
}