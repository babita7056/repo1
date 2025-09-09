//Write a Program to compute the volume of Earth in km^3 and miles
package Practicelevel1;
import java.util.Scanner;

public class ComputeVolume {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        double radiusKm = 6378; // radius of Earth in kilometers
        double radiusMiles = radiusKm * 0.621371; // converting radius to miles
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);  

        
    }
}