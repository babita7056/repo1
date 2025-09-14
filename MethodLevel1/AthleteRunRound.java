//4.An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete

import java.util.Scanner;
public class AthleteRunRound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side 1 of the triangular park (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side 2 of the triangular park (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter side 3 of the triangular park (in meters): ");
        double side3 = scanner.nextDouble();

        double perimeter = calculatePerimeter(side1, side2, side3);
        double distanceToRun = 5000; // 5 km in meters
        int rounds = (int) Math.ceil(distanceToRun / perimeter);

        System.out.printf("The athlete needs to complete %d rounds to run 5 km.%n", rounds);

        scanner.close();
    }
    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }
}
