//2.Library Management System
package KeywordsAndInstanceofLevel1;

public class Book {
    static String libraryName = "ABC Library";
    final int isbn;
    String title;
    String author;
    public Book(int isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
    public void display() {
        if(this instanceof Book){
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        }
    }
    public static void main(String[]args){
        Book book=new Book(123456789,"The Great Gatsby","F. Scott Fitzgerald");
        Book.displayLibraryName();
        book.display();
    }
}
