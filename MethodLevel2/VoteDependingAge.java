//7.Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.

package MethodLevel2;
import java.util.Scanner;
public class VoteDependingAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        for (int age : ages) {
            if (canStudentVote(age)) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }

        scanner.close();
    }
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false; 
        } else if (age >= 18) {
            return true; 
        } else {
            return false; 
        }
    }
}
