//6.Vehicle Registration System
package KeywordsAndInstanceofLevel1;

public class Vehical {
    static int registationFee = 1000;
    String ownerName;
    String vehicleType;
    int registrationNumber;

    public Vehical(String ownerName, String vehicleType, int registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }
    public static void updateRegistrationfee(int newFee) {
        registationFee = newFee;
    }
    public void display() {
        if(this instanceof Vehical){
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: " + registationFee);
    }
}
public static void main(String[]args){
    Vehical vehicle1 = new Vehical("John Doe", "Car", 1234);
    vehicle1.display();
    Vehical.updateRegistrationfee(2000);
    System.out.println("Updated Registration Fee: " + registationFee);
    
    
    
}
}
