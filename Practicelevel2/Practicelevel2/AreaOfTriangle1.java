//Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 
package Practicelevel2;
import java.util.Scanner;
public class AreaOfTriangle1 {
 
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the base of the triangle in inches: "); 
    double base = sc.nextDouble();
    System.out.print("Enter the height of the triangle in inches: ");
    double height = sc.nextDouble();
    double areaInInches = 0.5 * base * height;
    double areaInCm = areaInInches * 6.4516; 
    System.out.println("The area of the triangle is " + areaInInches + " square inches and " + areaInCm + " square centimeters.");  

}
}
