//5.Library Book System: Create a Book class with attributes title, author, price, and availability. Implement a method to borrow a book.
package ConstructorLevel1;

public class Book1 {
    String title;
    double price;
    String author;
    boolean availability;
    public Book1(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }
    public void borrowBook() {
        if(availability) {
            availability = true;
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Book is not available for borrowing.");
        }
    }
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + availability);
    }
    public static void main(String[] args) {
        Book1 obj = new Book1("The Great Gatsby", "F. Scott Fitzgerald", 10.99, true);
        obj.display();
        obj.borrowBook();

    }
}
