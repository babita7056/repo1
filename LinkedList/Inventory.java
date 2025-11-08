package LinkedList;
class itemNode {
    String itemName;
    int itemID;
    int quantity;
    double price;
    itemNode next;
    public itemNode(String itemName, int itemID, int quantity, double price){
        this.itemName = itemName;
        this.itemID = itemID;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}
class InventoryList{
    itemNode head;
    void addItemFirst(String itemName, int itemID, int quantity, double price){
        itemNode newItem = new itemNode(itemName, itemID, quantity, price);
        newItem.next = head;
        head = newItem;
    }
    void addItemLast(String itemName, int itemID, int quantity, double price){
        itemNode newItem = new itemNode(itemName, itemID, quantity, price);
        if(head == null){
            head = newItem;
            return;
        }
        itemNode current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newItem;
    }
    void removeItem(int itemID){
        if(head == null){
            return;
        }
        if(head.itemID == itemID){
            head = head.next;
            return;
        }
        itemNode current = head;
        while(current.next != null){
            if(current.next.itemID == itemID){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
    void displayInventory(){
        itemNode current = head;
        while(current != null){
            System.out.println("Item Name: " + current.itemName + ", Item ID: " + current.itemID + ", Quantity: " + current.quantity + ", Price: " + current.price);
            current = current.next;
        }
    }
    
}

public class Inventory {
    public static void main(String[] args) {
        InventoryList inventory = new InventoryList();
        inventory.addItemLast("Laptop", 101, 5, 750.00);
        inventory.addItemLast("Smartphone", 102, 10, 500.00);
        inventory.addItemFirst("Tablet", 103, 7, 300.00);
        inventory.displayInventory();
        System.out.println("After removing item with ID 102:");
        inventory.removeItem(102);
        inventory.displayInventory();
    }
}
