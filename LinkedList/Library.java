
package LinkedList;
class MNode{
    String title;
    String director;
    int releaseYear;
    int rating;
    MNode next;
    MNode prev;
    public MNode(String title, String director, int releaseYear, int rating){
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}
class Movielist{
    MNode head;
    MNode tail;
    void addMovieFirst(String title, String director, int releaseYear, int rating){
        MNode newMovie = new MNode(title, director, releaseYear, rating);
        if(head == null){
            head = newMovie;
            tail = newMovie;
        }else{
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }
    void addMovieLast(String title, String director, int releaseYear, int rating){
        MNode newMovie = new MNode(title, director, releaseYear, rating);
        if(tail == null){
            head = newMovie;
            tail = newMovie;
        }else{
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }

    void removeMovie(String title){
        MNode current = head;
        while(current != null){
            if(current.title.equals(title)){
                if(current.prev != null){
                    current.prev.next = current.next;
                }else{
                    head = current.next;
                }
                if(current.next != null){
                    current.next.prev = current.prev;
                }else{
                    tail = current.prev;
                }
                return;
            }
            current = current.next;
        }
    }
    void displayForward(){
        MNode current = head;
        while(current != null){
            System.out.println("Title: " + current.title + ", Director: " + current.director + ", Year: " + current.releaseYear + ", Rating: " + current.rating);
            current = current.next;
        }
    }
}
public class Library {
    public static void main(String[] args) {
        Movielist list = new Movielist();
        list.addMovieFirst("Inception", "Christopher Nolan", 2010, 8);
        list.addMovieLast("The Matrix", "Lana Wachowski", 1999, 9);
        list.addMovieFirst("Interstellar", "Christopher Nolan", 2014, 8);
        list.displayForward();
        list.removeMovie("The Matrix");
        list.displayForward();
    }
}
