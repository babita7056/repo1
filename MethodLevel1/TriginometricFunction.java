//12.Write a program to calculate various trigonometric functions using Math class given an angle in degrees
import java.util.Scanner;
public class TriginometricFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the angle in degrees: ");
        double angleInDegrees = scanner.nextDouble();

        double[] trigFunctions = calculateTrigonometricFunctions(angleInDegrees);
        System.out.printf("Sine: %.4f%n", trigFunctions[0]);
        System.out.printf("Cosine: %.4f%n", trigFunctions[1]);
        System.out.printf("Tangent: %.4f%n", trigFunctions[2]);

        scanner.close();
    }
    public static double[] calculateTrigonometricFunctions(double angle) {
        double angleInRadians = Math.toRadians(angle);
        double sine = Math.sin(angleInRadians);
        double cosine = Math.cos(angleInRadians);
        double tangent = Math.tan(angleInRadians);
        return new double[]{sine, cosine, tangent};
    }
}
