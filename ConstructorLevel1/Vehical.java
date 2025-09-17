//3.Vehicle Registration
package ConstructorLevel1;

public class Vehical {
    String ownerName;
    String vehicleType;
    static int registationFee=1000;
    public Vehical(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    void displayVehicalDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registationFee);
    }
    static void updateRegistrationfee(int newFee){
        registationFee=newFee;
    }
    public static void main(String[]args){
        Vehical vehical=new Vehical("John","Car");
        vehical.displayVehicalDetails();
        Vehical.updateRegistrationfee(2000);
        vehical.displayVehicalDetails();
        
    }
}
