//7.Create a program to find the BMI of a person

package Level3Practice;

import java.util.Scanner;

public class FindBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in kg: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightCm = scanner.nextDouble();

        double heightM = heightCm / 100; // Convert cm to meters
        double bmi = weight / (heightM * heightM);

        System.out.printf("Your BMI is: %.2f%n", bmi);

        if (bmi < 18.5) {
            System.out.println("Weight Status: Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Weight Status: Normal weight");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Weight Status: Overweight");
        } else {
            System.out.println("Weight Status: Obesity");
        }

    
    }
}
