//7.Create a Product class with:Instance Variables: productName, price.Class Variable: totalProducts (shared among all products).An instance method displayProductDetails() to display the details of a product. A class method displayTotalProducts() to show the total number of products created.
package ConstructorLevel1;

public class Product {
    String productName;
    double price;
    static int totalProducts=0;
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }
    public static void displayTotalProducts() {
        System.out.println("Total number of products: " + totalProducts);
    }
    public static void  main(String[] args) {
        Product product1 = new Product("Laptop", 1299.99);
        Product product2 = new Product("Smartphone", 799.99);
        product1.displayProductDetails();
        product2.displayProductDetails();
        Product.displayTotalProducts();
    }
}
