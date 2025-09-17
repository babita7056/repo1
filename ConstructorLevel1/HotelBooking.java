//4.Hotel Booking System: Create a HotelBooking class with attributes guestName, roomType, and nights. Use default, parameterized, and copy constructors to initialize bookings.

package ConstructorLevel1;

public class HotelBooking {
    String guestName;
    String roomType;
    int nights;
    HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Unknown";
        this.nights = 0;
    }
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    HotelBooking(HotelBooking booking) {
        this.guestName = booking.guestName;
        this.roomType = booking.roomType;
        this.nights = booking.nights;
    }
    void display() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking("John Doe", "Standard", 3);
        HotelBooking booking2 = new HotelBooking(booking1);
        HotelBooking booking3 = new HotelBooking();
        booking1.display();
        booking2.display();
        booking3.display();
    }
}
