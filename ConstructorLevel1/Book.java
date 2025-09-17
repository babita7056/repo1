//1.Create a Book class with attributes title, author, and price. Provide both default and parameterized constructors.
package ConstructorLevel1;

public class Book {
  String title;
  String author;
  double price;

  public Book(String title, String author, double price) {
    this.title = title;
    this.author = author;
    this.price = price;
  }
  public Book() {
    title = "Unknown";
    author = "Unknown";
    price = 0.0;
  } 
  void display(){
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("Price: " + price);
  }
  
  public static void main(String[] args) {
    Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
    Book book2 = new Book();
    book1.display();
    book2.display();
    
  }
}
