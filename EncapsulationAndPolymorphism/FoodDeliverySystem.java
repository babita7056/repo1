//6.online food delivery
package EncapsulationAndPolymorphism;
interface Discountable {
    void applyDiscount(double percent);
    String getDiscountDetails();
}
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public String getItemDetails() {
        return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }
    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    protected void setPrice(double price) { this.price = price; }
}
class VegItem extends FoodItem implements Discountable {
    private double discount;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0;
    }

    @Override
    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        return total - (total * discount / 100);
    }

    @Override
    public void applyDiscount(double percent) {
        this.discount = percent;
    }

    @Override
    public String getDiscountDetails() {
        return "Veg item discount applied: " + discount + "%";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private double discount;
    private final double nonVegCharge = 30.0; 

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0;
    }

    @Override
    public double calculateTotalPrice() {
        double total = (getPrice() * getQuantity()) + nonVegCharge;
        return total - (total * discount / 100);
    }

    @Override
    public void applyDiscount(double percent) {
        this.discount = percent;
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg item discount applied: " + discount + "% (Extra charge Rs." + nonVegCharge + ")";
    }
}

public class FoodDeliverySystem {
    public static void processOrder(FoodItem[] items) {
        for (FoodItem item : items) {
            System.out.println(item.getItemDetails());
            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                d.applyDiscount(10); 
                System.out.println(d.getDiscountDetails());
            }
            System.out.println("Final Price: Rs." + item.calculateTotalPrice());
            System.out.println("----------------------------------");
        }
    }

    public static void main(String[] args) {
        FoodItem veg = new VegItem("Paneer Butter Masala", 200, 2);
        FoodItem nonVeg = new NonVegItem("Chicken Biryani", 300, 1);

        FoodItem[] order = { veg, nonVeg };
        processOrder(order);
    }
}

