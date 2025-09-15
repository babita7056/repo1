//8.Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.

package StringLevel2;
import java.util.Scanner;
public class AgeOfStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        
        int[] ages = generateRandomAges(numberOfStudents);
        String[][] votingEligibility = checkVotingEligibility(ages);
        
        displayVotingEligibility(votingEligibility);
        
        scanner.close();
    }
    
    public static int[] generateRandomAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = (int)(Math.random() * 90) + 1; 
        }
        return ages;
    }
    
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] eligibility = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            eligibility[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                eligibility[i][1] = "false"; 
            } else if (ages[i] >= 18) {
                eligibility[i][1] = "true"; 
            } else {
                eligibility[i][1] = "false"; 
            }
        }
        return eligibility;
    }
    
    public static void displayVotingEligibility(String[][] eligibility) {
        System.out.printf("%-10s %-10s%n", "Age", "Can Vote");
        System.out.println("--------------------");
        for (String[] entry : eligibility) {
            System.out.printf("%-10s %-10s%n", entry[0], entry[1]);
        }
    }
}