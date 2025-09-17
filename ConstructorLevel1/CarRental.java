//6.Car Rental System: Create a CarRental class with attributes customerName, carModel, and rentalDays. Add constructors to initialize the rental details and calculate total cost.
package ConstructorLevel1;

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double totalCost;
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.totalCost = calculateTotalCost();
    }
    public double calculateTotalCost() {
        double dailyRate = 100.0;
        return dailyRate * rentalDays;
    } 
    void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: $" + totalCost);
    }
    public static void main(String[]args){
        CarRental rental=new CarRental("John Doe", "Sedan", 5);
        rental.display();
    }
}
