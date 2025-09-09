//The University is charging the student a fee of INR 125000 for the course. The University is willing to offer a discount of 10%. 
//Write a program to find the discounted amount and discounted price the student will pay for the course.

package Practicelevel1;

import java.util.Scanner;

public class CalculatDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the course fee: ");
        double fee = sc.nextDouble();
        System.out.print("Enter the discount percentage: ");
        double discountPercent = sc.nextDouble();
        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);  
    }
    
}
