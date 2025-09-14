//8.Create a program to find the youngest friends among 3 Amar, Akbar and Anthony based on their ages and tallest among the friends based on their heights and display it

package MethodLevel2;
import java.util.Scanner;
public class FindYongestFriend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        
        for (int i = 0; i < friends.length; i++) {
            System.out.print("Enter the age of " + friends[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter the height of " + friends[i] + " in cm: ");
            heights[i] = scanner.nextDouble();
        }
        
        int youngestIndex = findYoungest(ages);
        int tallestIndex = findTallest(heights);
        
        System.out.println("The youngest friend is " + friends[youngestIndex] + " with age " + ages[youngestIndex]);
        System.out.println("The tallest friend is " + friends[tallestIndex] + " with height " + heights[tallestIndex] + " cm");
        
        scanner.close();
    }
    public static int findYoungest(int[] ages) {
        int youngestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        return youngestIndex;
    }
    public static int findTallest(double[] heights) {
        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        return tallestIndex;
    }

}
