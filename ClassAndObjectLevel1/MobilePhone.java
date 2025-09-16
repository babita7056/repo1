//5.Program to Handle Mobile Phone Details
package ClassAndObjectLevel1;
import java.util.Scanner;
public class MobilePhone {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Mobile Phone Brand: ");
        String brand=sc.next();
        System.out.println("Enter Mobile Phone Model: ");
        String model=sc.next();
        System.out.println("Enter Mobile Phone Price: ");
        double price=sc.nextDouble();
        MobilePhone obj=new MobilePhone();
        obj.DisplayDetails(brand,model,price);
        sc.close();
    }
    public void DisplayDetails(String brand,String model,double price){
        System.out.println("Mobile Phone Brand: "+brand);
        System.out.println("Mobile Phone Model: "+model);
        System.out.println("Mobile Phone Price: "+price);
    }
}
