//Write a program to calculate the area of a circle. Take the radius as input and use the formula:
package practice;
import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in); 
        System.out.println("enter radius");
     double radius=sc.nextDouble();
     double Area = Math.PI * radius*radius;
     System.out.println("area of the circle:"+Area);
    }
}

