//5.Program to Simulate a Shopping Cart
package ClassAndObjectLevel2;
import java.util.Scanner;
class CartItem {
    String itemName;
    double price;
    int quantity;
    void addItem(String name, double price, int qty) {
        this.itemName = name;
        this.price = price;
        this.quantity = qty;
        System.out.println("Item added to cart: " + qty + " x " + name);
    }
    void removeItem() {
        if (itemName != null) {
            System.out.println("Item: " + itemName + " removed from cart.");
            itemName = null;
            price = 0;
            quantity = 0;
        } else {
            System.out.println("Cart is already empty.");
        }
    }
    void displayTotal() {
        if (itemName != null) {
            double total = price * quantity;
            System.out.println("\n--- Cart Details ---");
            System.out.println("Item: " + itemName);
            System.out.println("Quantity: " + quantity);
            System.out.println("Price: " + price);
            System.out.println("Total Cost: " + total);
        } else {
            System.out.println("\nCart is empty.");
        }
    }
}
public class ShoppingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CartItem cart = new CartItem();
        int choice;

        do {
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Total");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();
                    cart.addItem(name, price, qty);
                    break;

                case 2:
                    cart.removeItem();
                    break;

                case 3:
                    cart.displayTotal();
                    break;

                case 4:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}

