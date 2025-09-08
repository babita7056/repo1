//10.Write a program that takes the distance in kilometers as input from the user and converts it into miles using the formula:
package practice;
import java.util.Scanner;
public class ConvertMiletoKilomet {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in); 
        System.out.println("enter distance in kilometer");
     double kilometer=sc.nextDouble();
     double miles = kilometer * 0.621371;
     System.out.println("convert into miles:"+miles);
    }
}
