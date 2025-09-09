package Practicelevel1;

import java.util.Scanner;

public class ProfitAndLoss {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Cost Price and Selling Price: ");
    int costPrice = sc.nextInt();
    int sellingPrice = sc.nextInt();

   
    int profit = sellingPrice - costPrice;
    double profitPercentage = (double) profit / costPrice * 100;

    System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + String.format("%.2f", profitPercentage) + "%");
}

    
}
