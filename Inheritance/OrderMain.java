//5.Multilevel Inheritance

package Inheritance;

class Order {
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order placed";
    }

    void displayInfo() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Status: " + getOrderStatus());
    }
}
class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order shipped (Tracking: " + trackingNumber + ")";
    }

    @Override
    void displayInfo() {
        super.displayInfo();
    }
}
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
    }
}
public class OrderMain {
    public static void main(String[] args) {
        Order o1 = new Order(101, "2025-09-20");
        ShippedOrder s1 = new ShippedOrder(102, "2025-09-21", "TRK12345");
        DeliveredOrder d1 = new DeliveredOrder(103, "2025-09-22", "TRK67890", "2025-09-23");

        o1.displayInfo();
        s1.displayInfo();
        d1.displayInfo();
    }
}
