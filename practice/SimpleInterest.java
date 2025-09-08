//6.Write a program to calculate simple interest using the formula:Simple Interest = (Principal * Rate * Time) / 100.Take Principal, Rate, and Time as inputs from the user.
package practice;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        System.out.println("enter principal");
     double principal=sc.nextDouble();
     System.out.println("enter rate");
     double rate=sc.nextDouble();
     System.out.println("enter time");
     double time=sc.nextDouble();
     double SimpleInterest = (principal * rate * time) / 100;
     System.out.println("simple interest:"+SimpleInterest);
    }
}
