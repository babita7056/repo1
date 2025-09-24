//3.Vehicle and Transport System
package Inheritance;
class Vehicle {
    int maxSpeed;
    String fuelType;

    void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
    }
}
class Car extends Vehicle {
    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
        this.seatCapacity = seatCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}
class Truck extends Vehicle {
    int loadCapacity;

    Truck(int maxSpeed, String fuelType, int loadCapacity) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
        this.loadCapacity = loadCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}
class Motorcycle extends Vehicle {
    String type;

    Motorcycle(int maxSpeed, String fuelType, String type) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
        this.type = type;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Motorcycle Type: " + type);
    }
}
public class VehicleMain {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 15);
        vehicles[2] = new Motorcycle(200, "Petrol", "Sports");
        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println("-------------------");
        }
    }
}
