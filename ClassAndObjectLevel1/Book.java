//3.Program to Handle Book Details
package ClassAndObjectLevel1;
import java.util.Scanner;
public class Book {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Book ID: ");
        double Id=sc.nextDouble();
        System.out.println("Enter Book Name: ");
        String Name=sc.next();
        System.out.println("Enter Book Price: ");
        double Price=sc.nextDouble();
        Book obj=new Book();
        obj.DetailOfBook(Id,Name,Price);
        sc.close();
    }
    public void DetailOfBook(double Id,String Name,double Price){
        System.out.println("Book ID: "+Id);
        System.out.println("Book Name: "+Name);
        System.out.println("Book Price: "+Price);
    }
}
