//2.Program to Compute Area of a Circle
package ClassAndObjectLevel1;
import java.util.Scanner;
public class Circle {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        double radius=sc.nextDouble();
        Circle obj=new Circle();
        obj.AreaOfCircle(radius);
        sc.close();
    }
    public void AreaOfCircle(double radius){
        double area=3.14*radius*radius;
        System.out.println("Area of circle is: "+area);
    }
}
