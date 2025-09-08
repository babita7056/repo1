//5.Write a program to calculate the volume of a cylinder. Take the radius and height as inputs and use the formula:
package practice;
import java.util.Scanner;
public class VolumeOfCylinder {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in); 
            System.out.println("enter radius");
        double radius=sc.nextDouble();
        System.out.println("enter height");
        double height=sc.nextDouble();
        double Volume = Math.PI * radius * radius * height;
        System.out.println("volume of the cylinder:"+Volume);
    }
}
