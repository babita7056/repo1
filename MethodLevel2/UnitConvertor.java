//4.Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods.

package MethodLevel2;
import java.util.Scanner;
public class UnitConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter distance in kilometers: ");
        double km = scanner.nextDouble();
        System.out.println(km + " kilometers is equal to " + convertKmToMiles(km) + " miles.");
        
        System.out.print("Enter distance in miles: ");
        double miles = scanner.nextDouble();
        System.out.println(miles + " miles is equal to " + convertMilesToKm(miles) + " kilometers.");
        
        System.out.print("Enter distance in meters: ");
        double meters = scanner.nextDouble();
        System.out.println(meters + " meters is equal to " + convertMetersToFeet(meters) + " feet.");
        
        System.out.print("Enter distance in feet: ");
        double feet = scanner.nextDouble();
        System.out.println(feet + " feet is equal to " + convertFeetToMeters(feet) + " meters.");
        
        scanner.close();
    }
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

}
