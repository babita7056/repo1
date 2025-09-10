//7.Rewrite the above program using multi-dimensional array to store height, weight, and BMI in 2D array for all the persons

package ArrayLevel2;
import java.util.Scanner;
public class MultiDimensionarr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();

        if (numPersons <= 0) {
            System.out.println("Error: Please enter a positive integer greater than 0.");
            scanner.close();
            return;
        }

        double[][] personData = new double[numPersons][3]; // [][0] = height, [][1] = weight, [][2] = BMI
        String[] weightStatus = new String[numPersons];

        for (int i = 0; i < numPersons; i++) {
            System.out.print("Enter height (in meters) of person " + (i + 1) + ": ");
            personData[i][0] = scanner.nextDouble();
            while (personData[i][0] <= 0) {
                System.out.print("Invalid input. Please enter a positive height: ");
                personData[i][0] = scanner.nextDouble();
            }

            System.out.print("Enter weight (in kg) of person " + (i + 1) + ": ");
            personData[i][1] = scanner.nextDouble();
            while (personData[i][1] <= 0) {
                System.out.print("Invalid input. Please enter a positive weight: ");
                personData[i][1] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < numPersons; i++) {
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]); // Calculate BMI
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        System.out.printf("%-10s %-10s %-10s %-20s%n", "Height(m)", "Weight(kg)", "BMI", "Status");
        for (int i = 0; i < numPersons; i++) {
}
    }}