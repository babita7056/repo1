//6.Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods.

package MethodLevel2;
import java.util.Scanner;
public class UnitConvertor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        System.out.println(fahrenheit + " Fahrenheit is equal to " + convertFahrenheitToCelsius(fahrenheit) + " Celsius.");
        
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        System.out.println(celsius + " Celsius is equal to " + convertCelsiusToFahrenheit(celsius) + " Fahrenheit.");
        
        System.out.print("Enter weight in pounds: ");
        double pounds = scanner.nextDouble();
        System.out.println(pounds + " pounds is equal to " + convertPoundsToKilograms(pounds) + " kilograms.");
        
        System.out.print("Enter weight in kilograms: ");
        double kilograms = scanner.nextDouble();
        System.out.println(kilograms + " kilograms is equal to " + convertKilogramsToPounds(kilograms) + " pounds.");
        
        System.out.print("Enter volume in gallons: ");
        double gallons = scanner.nextDouble();
        System.out.println(gallons + " gallons is equal to " + convertGallonsToLiters(gallons) + " liters.");
        
        System.out.print("Enter volume in liters: ");
        double liters = scanner.nextDouble();
        System.out.println(liters + " liters is equal to " + convertLitersToGallons(liters) + " gallons.");
        
        scanner.close();
    }
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

}
