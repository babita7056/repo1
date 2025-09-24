//4.Single Inheritance
package Inheritance;

 class Book {
    String title;
    int publicationYear;
    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
    
}
class Author extends Book {
    String name;
    String bio;
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + name);
        System.out.println("Biography: " + bio);
    }
}
public class BookMain {
    public static void main(String[] args) {
        Author obj = new Author();
        obj.title = "The Great Gatsby";
        obj.publicationYear = 1925;
        obj.name = "F. Scott Fitzgerald";
        obj.bio = "American novelist and short story writer.";
        obj.displayInfo();
    }
}