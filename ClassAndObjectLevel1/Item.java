//4.Program to Track Inventory of Items
package ClassAndObjectLevel1;
import java.util.Scanner;
public class Item {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Item Code: ");
    int itemCode=sc.nextInt();
    System.out.println("Enter Item Name: ");
    String itemName=sc.next();
    System.out.println("Enter Item Price: ");
    double price=sc.nextDouble();
    System.out.println("Enter Quantity: ");
    int quantity=sc.nextInt();
    Item obj=new Item();
    obj.calculateTotal(quantity,price);
    obj.ItemDetails(itemCode,itemName,price);
    sc.close();
}
public void ItemDetails(int itemCode,String itemName,double price){
    System.out.println("Item Code: "+itemCode);
    System.out.println("Item Name: "+itemName);
    System.out.println("Item Price: "+price);
}
public double calculateTotal(int quantity,double price){ {
        double total = price * quantity;
        System.out.println("Total: "+total);
        return total;
    }
    
}
}
