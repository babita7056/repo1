//10.Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade as shown in figure below


package StringLevel2;
import java.util.Scanner;
public class MarksOfStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        
        int[][] scores = generateRandomScores(numberOfStudents);
        double[][] totalsAndPercentages = calculateTotalsAndPercentages(scores);
        String[][] grades = calculateGrades(totalsAndPercentages);
        
        displayScorecard(scores, totalsAndPercentages, grades);
        
        scanner.close();
    }
    public static int[][] generateRandomScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = (int)(Math.random() * 100); 
            scores[i][1] = (int)(Math.random() * 100); 
            scores[i][2] = (int)(Math.random() * 100); 
        }
        return scores;
    }
    public static double[][] calculateTotalsAndPercentages(int[][] scores) {
        double[][] totalsAndPercentages = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            totalsAndPercentages[i][0] = total;
            totalsAndPercentages[i][1] = Math.round(average * 100.0) / 100.0; 
            totalsAndPercentages[i][2] = Math.round(percentage * 100.0) / 100.0; 
        }
        return totalsAndPercentages;
    }
    public static String[][] calculateGrades(double[][] totalsAndPercentages) {
        String[][] grades = new String[totalsAndPercentages.length][1];
        for (int i = 0; i < totalsAndPercentages.length; i++) {
            double percentage = totalsAndPercentages[i][2];
            if (percentage >= 90) {
                grades[i][0] = "A";
            } else if (percentage >= 80) {
                grades[i][0] = "B";
            } else if (percentage >= 70) {
                grades[i][0] = "C";
            } else if (percentage >= 60) {
                grades[i][0] = "D";
            } else if (percentage >= 50) {
                grades[i][0] = "E";
            } else {
                grades[i][0] = "F";
            }
        }
        return grades;
    }
    public static void displayScorecard(int[][] scores, double[][] totalsAndPercentages, String[][] grades) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s%n", "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage", "Grade");
        System.out.println("------------------------------------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-10.2f %-10.2f %-10s%n", 
                              (i + 1), 
                              scores[i][0], 
                              scores[i][1], 
                              scores[i][2], 
                              totalsAndPercentages[i][0], 
                              totalsAndPercentages[i][1], 
                              totalsAndPercentages[i][2], 
                              grades[i][0]);
        }
    }
}
