package LinkedList;

 class Node {
    String title;
    String director;
    int releaseYear;
    int rating; 
    Node next;
    Node prev;
    public Node(String title, String director, int releaseYear, int rating) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }

}
 class Movielist{
    Node head;
    Node tail;
    void addMovieFirst(String title, String director, int releaseYear, int rating){
        Node newMovie = new Node(title, director, releaseYear, rating);
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
        Node newMovie = new Node(title, director, releaseYear, rating);
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
        Node current = head;
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
   
    void displayMovies(){
        Node current = head;
        while(current != null){
            System.out.println("Title " + current.title + "->Director " + current.director + "-> Release Year" + current.releaseYear + "-> Rating " + current.rating);
            current = current.next;
        }
    }

}
public class Movie{
    public static void main(String[] args) {
        Movielist list = new Movielist();
        list.addMovieLast("Inception", "Christopher Nolan", 2010, 9);
        list.addMovieFirst("The Matrix", "The Wachowskis", 1999, 10);
        list.addMovieLast("Interstellar", "Christopher Nolan", 2014, 8);
        list.displayMovies();
        list.removeMovie("The Matrix");
        list.displayMovies();
    }
}