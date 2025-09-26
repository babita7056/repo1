//2.E-Commerce Platform
package EncapsulationAndPolymorphism;
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}
abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    public abstract double calculateDiscount();

    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) {
        if (price >= 0) this.price = price;
    }
}
class Electronics extends Product implements Taxable {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }
@Override
    public double calculateDiscount() {
        return getPrice() * 0.10; 
    }
@Override
    public double calculateTax() {
        return getPrice() * 0.15; 
    }
@Override
    public String getTaxDetails() {
        return "Electronics tax is 15%";
    }
}
class Clothing extends Product implements Taxable {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }
@Override
    public double calculateDiscount() {
        return getPrice() * 0.20; 
    }
@Override
    public double calculateTax() {
        return getPrice() * 0.05; 
    }
@Override
    public String getTaxDetails() {
        return "Clothing tax is 5%";
    }
}
class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }
@Override
    public double calculateDiscount() {
        return getPrice() * 0.05; 
    }
}
public class Store {
    public static void main(String[] args) {
        Electronics laptop = new Electronics(101, "Laptop", 50000);
        Clothing tshirt = new Clothing(201, "T-Shirt", 1000);
        Groceries rice = new Groceries(301, "Rice", 2000);
        
        double discount = laptop.calculateDiscount();
        double tax = laptop.calculateTax();
        System.out.println(laptop.getTaxDetails());
        System.out.println(laptop.getName() + " final price: " + (laptop.getPrice() + tax - discount));
        System.out.println();

        discount = tshirt.calculateDiscount();
        tax = tshirt.calculateTax();
        System.out.println(tshirt.getTaxDetails());
        System.out.println(tshirt.getName() + " final price: " + (tshirt.getPrice() + tax - discount));
        System.out.println();

        discount = rice.calculateDiscount();
        System.out.println(rice.getName() + " final price: " + (rice.getPrice() - discount));
    }
}