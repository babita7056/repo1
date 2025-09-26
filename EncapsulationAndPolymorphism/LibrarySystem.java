//5.Library managment System
package EncapsulationAndPolymorphism;
interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private String borrower; 

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.borrower = null; 
    }

    public abstract int getLoanDuration();

    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }
    protected void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public String getBorrower() {
        return borrower;
    }

    public boolean isBorrowed() {
        return borrower != null;
    }
}
class Book extends LibraryItem implements Reservable {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; 
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isBorrowed()) {
            setBorrower(borrowerName);
            System.out.println("Book reserved for " + borrowerName);
        } else {
            System.out.println("Book already borrowed by " + getBorrower());
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isBorrowed();
    }
}

class Magazine extends LibraryItem implements Reservable {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isBorrowed()) {
            setBorrower(borrowerName);
            System.out.println("Magazine reserved for " + borrowerName);
        } else {
            System.out.println("Magazine already borrowed by " + getBorrower());
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isBorrowed();
    }
}
class DVD extends LibraryItem implements Reservable {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3;
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isBorrowed()) {
            setBorrower(borrowerName);
            System.out.println("DVD reserved for " + borrowerName);
        } else {
            System.out.println("DVD already borrowed by " + getBorrower());
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isBorrowed();
    }
}
public class LibrarySystem {
    public static void main(String[] args) {
     
        LibraryItem book = new Book("B101", "Java Basics", "John Doe");
        LibraryItem magazine = new Magazine("M202", "Tech World", "Editor A");
        LibraryItem dvd = new DVD("D303", "Inception", "Christopher Nolan");

        LibraryItem[] items = { book, magazine, dvd };

        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;
                r.reserveItem("Alice");
                System.out.println("Available? " + r.checkAvailability());
            }
            System.out.println("----------------------------");
        }
    }
}

