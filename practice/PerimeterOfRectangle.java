//7.Write a program to calculate the perimeter of a rectangle. Take the length and width as inputs and use the formula:
package practice;
import java.util.Scanner;
public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        System.out.println("enter length");
     double length=sc.nextDouble();
     System.out.println("enter width");
     double width=sc.nextDouble();
     double Perimeter = 2 * (length + width);
     System.out.println("perimeter of the rectangle:"+Perimeter);
    }
}
