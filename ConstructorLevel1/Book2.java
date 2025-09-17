//2.Design a Book class with:ISBN (public).title (protected).author (private).Write methods to:Set and get the author name.Create a subclass EBook to access ISBN and title and demonstrate access modifiers.

package ConstructorLevel1;

public class Book2 {
    public String ISBN; 
    protected String title; 
    private String author; 

    public Book2(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
    void displaystu() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
    static class EBook extends Book2 {
        public EBook(String ISBN, String title, String author) {
            super(ISBN, title, author);
        }
        void display() {
            System.out.println("ISBN: " + ISBN);
            System.out.println("Title: " + title);
           
        }
    }
    public static void main(String[] args) {
        Book2 book = new Book2("123456789", "The Great Gatsby", "F. Scott Fitzgerald");
        book.displaystu();
        book.setAuthor("Jane Austen");
        System.out.println("Author: " + book.getAuthor());
        EBook eBook = new EBook("987654321", "1984", "George Orwell");
        eBook.display();
        eBook.displaystu();
    }
}
