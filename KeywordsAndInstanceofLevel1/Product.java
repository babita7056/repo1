//4.: Shopping Cart System
package KeywordsAndInstanceofLevel1;
public class Product {
    static double discount=10.0;
    final int productId;
    String productName;
    double price;
    int quantity;
    Product(String productName, double price, int quantity,int productId) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productId=productId;
    }
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }
    public void display() {
        if(this instanceof Product){
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount);
    }
} 
public static void main(String[]args){
    Product p1=new Product("Laptop",50000,1,1);
    Product p2=new Product("Mobile",30000,2,2);
    p1.display();
    p2.display();
    Product.updateDiscount(20.0);
    p1.display();
    System.out.println("updated discount");
   
}
}
