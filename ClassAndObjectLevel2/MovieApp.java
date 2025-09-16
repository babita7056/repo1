//4.Problem Statement: Create a MovieTicket class with attributes movieName, seatNumber, and price. Add methods to:
package ClassAndObjectLevel2;
import java.util.Scanner;

class MovieTicket {
    String movieName;
    int seatNumber;
    double price;
    void bookTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }
    void displayTicket() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    
}
}

public class MovieApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieTicket ticket = new MovieTicket();
        System.out.print("Enter Movie Name: ");
        String movie = sc.nextLine();
        System.out.print("Enter Seat Number: ");
        int seat = sc.nextInt();
        System.out.print("Enter Ticket Price: ");
        double price = sc.nextDouble();
        ticket.bookTicket(movie, seat, price);
        ticket.displayTicket();
        sc.close();
    }
}

