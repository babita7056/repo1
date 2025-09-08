//8.Write a program that takes two numbers as input: a base and an exponent,and prints the result of base raised to the exponent (without using loops orconditionals).
package practice;
import java.util.Scanner;
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        System.out.println("enter base");
     double base=sc.nextDouble();
      System.out.println("enter exponent");
     double exponent=sc.nextDouble();
     double result = Math.pow(base, exponent);
     System.out.println("result of base raised to the exponent:"+result);
    }
}
