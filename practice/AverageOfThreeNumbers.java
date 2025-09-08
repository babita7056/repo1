//9.Write a program that takes three numbers as input from the user and prints their average.
package practice;
import java.util.Scanner;
public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int num1=sc.nextInt();
         System.out.println("enter second number");
        int num2=sc.nextInt();
         System.out.println("enter third number");
        int num3=sc.nextInt();
       int result=(num1+num2+num3)/3;
         System.out.println("average of three numbers :" + result);
    }
}
