//9.Write a program Euclidean distance between two points as well as the equation of the line using those two points. Use Math functions Math.pow() and Math.sqrt()

package MethodLevel3;
import java.util.Scanner;
public class EuclideanDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance: %.2f%n", distance);

        double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);
        if (lineEquation != null) {
            System.out.printf("Line Equation: y = %.2fx + %.2f%n", lineEquation[0], lineEquation[1]);
        } else {
            System.out.println("The line is vertical; slope is undefined.");
        }

        scanner.close();
    }
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        if (x1 == x2) {
            return null; 
        }
        double m = (y2 - y1) / (x2 - x1); 
        double b = y1 - m * x1; 
        return new double[]{m, b};
    }

}
