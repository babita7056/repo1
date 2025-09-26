//8.Ride HailingApp
package EncapsulationAndPolymorphism;
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}
abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;

    public Vehicle(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = currentLocation;
    }
    public abstract double calculateFare(double distance);

    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate/km: " + ratePerKm;
    }
    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }

    public String getCurrentLocation() { return currentLocation; }
    protected void setCurrentLocation(String currentLocation) { this.currentLocation = currentLocation; }
}
class Car extends Vehicle implements GPS {
    public Car(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm, currentLocation);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm(); 
    }

    @Override
    public String getCurrentLocation() {
        return super.getCurrentLocation();
    }

    @Override
    public void updateLocation(String newLocation) {
        setCurrentLocation(newLocation);
    }
}
class Bike extends Vehicle implements GPS {
    public Bike(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm, currentLocation);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 0.8; 
    }

    @Override
    public String getCurrentLocation() {
        return super.getCurrentLocation();
    }

    @Override
    public void updateLocation(String newLocation) {
        setCurrentLocation(newLocation);
    }
}
class Auto extends Vehicle implements GPS {
    public Auto(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm, currentLocation);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 10; 
    }

    @Override
    public String getCurrentLocation() {
        return super.getCurrentLocation();
    }

    @Override
    public void updateLocation(String newLocation) {
        setCurrentLocation(newLocation);
    }
}
public class RideHailingApp {
    public static void processRides(Vehicle[] vehicles, double distance) {
        for (Vehicle v : vehicles) {
            System.out.println(v.getVehicleDetails());
            System.out.println("Current Location: " + ((GPS)v).getCurrentLocation());
            double fare = v.calculateFare(distance);
            System.out.println("Fare for " + distance + " km: Rs." + fare);
            System.out.println("---------------------------------");
        }
    }

    public static void main(String[] args) {
        Vehicle car = new Car("C101", "Alice", 15, "City Center");
        Vehicle bike = new Bike("B202", "Bob", 10, "Railway Station");
        Vehicle auto = new Auto("A303", "Charlie", 12, "Bus Stand");

        Vehicle[] rides = { car, bike, auto };
        processRides(rides, 10); 
    }
}

