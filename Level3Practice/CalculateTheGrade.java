//3.Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the following guidelines 

package Level3Practice;
import java.util.Scanner;
public class CalculateTheGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks for Physics: ");
        int physics = scanner.nextInt();

        System.out.print("Enter marks for Chemistry: ");
        int chemistry = scanner.nextInt();

        System.out.print("Enter marks for Maths: ");
        int maths = scanner.nextInt();

        int totalMarks = physics + chemistry + maths;
        double percentage = (totalMarks / 300.0) * 100;

        String grade;
        String remarks;

        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70 && percentage < 80) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60 && percentage < 70) {
            grade = "C";
            remarks = "Level 2, below but approaching agency-normalized standards";
        } else if (percentage >= 50 && percentage < 60) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40 && percentage < 50) {
            grade = "E";
            remarks = "Level 1, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        System.out.printf("Total Marks: %d\n", totalMarks);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.printf("Grade: %s\n", grade);
        System.out.printf("Remarks: %s\n", remarks);

    }
}
