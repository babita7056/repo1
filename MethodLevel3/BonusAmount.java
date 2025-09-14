//11.Create a program to find the bonus of 10 employees based on their years of service as well as the total bonus amount the 10-year-old company Zara has to pay as a bonus, along with the old and new salary.

package MethodLevel3;
import java.util.Scanner;
public class BonusAmount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfEmployees = 10;
        double[][] employeeData = new double[numberOfEmployees][2]; // [][0] = salary, [][1] = years of service

        for (int i = 0; i < numberOfEmployees; i++) {
            employeeData[i] = generateEmployeeData();
        }

        double[][] updatedEmployeeData = calculateNewSalaryAndBonus(employeeData);

        displaySummary(employeeData, updatedEmployeeData);

        scanner.close();
    }
    public static double[] generateEmployeeData() {
        double salary = 10000 + Math.random() * 90000; // Random salary between 10,000 and 100,000
        double yearsOfService = Math.random() * 10; // Random years of service between 0 and 10
        return new double[]{salary, yearsOfService};
    }
    public static double[][] calculateNewSalaryAndBonus(double[][] employeeData) {
        double[][] updatedData = new double[employeeData.length][3]; // [][0] = old salary, [][1] = bonus, [][2] = new salary

        for (int i = 0; i < employeeData.length; i++) {
            double oldSalary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double bonus;

            if (yearsOfService > 5) {
                bonus = oldSalary * 0.05;
            } else {
                bonus = oldSalary * 0.02;
            }

            double newSalary = oldSalary + bonus;
            updatedData[i][0] = oldSalary;
            updatedData[i][1] = bonus;
            updatedData[i][2] = newSalary;
        }

        return updatedData;
    }
    public static void displaySummary(double[][] oldData, double[][] newData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.printf("%-15s %-15s %-15s %-15s%n", "Old Salary", "Bonus", "New Salary", "Years of Service");
        for (int i = 0; i < oldData.length; i++) {
            double oldSalary = newData[i][0];
            double bonus = newData[i][1];
            double newSalary = newData[i][2];
            double yearsOfService = oldData[i][1];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%-15.2f %-15.2f %-15.2f %-15.2f%n", oldSalary, bonus, newSalary, yearsOfService);
        }

        System.out.println("------------------------------------------------------------");
        System.out.printf("%-15.2f %-15.2f %-15.2f%n", totalOldSalary, totalBonus, totalNewSalary);
    }

}
