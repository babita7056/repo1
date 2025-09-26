//3.Vehicle Rental System
package EncapsulationAndPolymorphism;
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    private String insurancePolicyNumber;  

    public Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }
    public abstract double calculateRentalCost(int days);
    protected String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }
    public String getVehicleNumber() { return vehicleNumber; }
    public void setVehicleNumber(String vehicleNumber) { this.vehicleNumber = vehicleNumber; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public double getRentalRate() { return rentalRate; }
    public void setRentalRate(double rentalRate) { this.rentalRate = rentalRate; }
}
class Car extends Vehicle implements Insurable {
    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;  
    }
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.1;   
    }

    @Override
    public String getInsuranceDetails() {
        return "Car insurance (Policy: " + getInsurancePolicyNumber() + ")";
    }
}
class Bike extends Vehicle implements Insurable {
    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate, insurancePolicyNumber);
    }
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.9; 
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05; 
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike insurance (Policy: " + getInsurancePolicyNumber() + ")";
    }
}
class Truck extends Vehicle implements Insurable {
    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 500; 
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.2; 
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck insurance (Policy: " + getInsurancePolicyNumber() + ")";
    }
}
public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("CAR123", 2000, "POL123"),
            new Bike("BIKE456", 500, "POL456"),
            new Truck("TRUCK789", 5000, "POL789")
        };

        int rentalDays = 5;
        for (Vehicle v : vehicles) {
            System.out.println("Vehicle: " + v.getType() + " (" + v.getVehicleNumber() + ")");
            double rentalCost = v.calculateRentalCost(rentalDays);
            System.out.println("Rental cost for " + rentalDays + " days: " + rentalCost);

            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                System.out.println(ins.getInsuranceDetails());
                System.out.println("Insurance cost: " + ins.calculateInsurance());
            }
            System.out.println("---------------------------");
        }
    }
}

