//5.Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods.

package MethodLevel2;
import java.util.Scanner;
public class UnitConvertor1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter distance in yards: ");
        double yards = scanner.nextDouble();
        System.out.println(yards + " yards is equal to " + convertYardsToFeet(yards) + " feet.");
        
        System.out.print("Enter distance in feet: ");
        double feet = scanner.nextDouble();
        System.out.println(feet + " feet is equal to " + convertFeetToYards(feet) + " yards.");
        
        System.out.print("Enter distance in meters: ");
        double meters = scanner.nextDouble();
        System.out.println(meters + " meters is equal to " + convertMetersToInches(meters) + " inches.");
        
        System.out.print("Enter distance in inches: ");
        double inches = scanner.nextDouble();
        System.out.println(inches + " inches is equal to " + convertInchesToMeters(inches) + " meters.");
        
        System.out.print("Enter distance in inches: ");
        double inchesForCm = scanner.nextDouble();
        System.out.println(inchesForCm + " inches is equal to " + convertInchesToCm(inchesForCm) + " centimeters.");
        
        scanner.close();
    }
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3.0;
        return yards * yards2feet;
    }
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }
    public static double convertInchesToCm(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

}
