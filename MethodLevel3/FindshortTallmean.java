//1.Create a program to find the shortest, tallest, and mean height of players present in a football team.
package MethodLevel3;
import java.util.Scanner;
public class FindshortTallmean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + (int)(Math.random() * 101); 
        }

        System.out.print("Heights of players in cm: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();
        
        int sum = sumOfHeights(heights);
        double mean = meanHeight(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        
        System.out.println("Sum of heights: " + sum + " cm");
        System.out.println("Mean height: " + mean + " cm");
        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
        
        scanner.close();
    }
    public static int sumOfHeights(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }
    public static double meanHeight(int[] heights) {
        return (double) sumOfHeights(heights) / heights.length;
    }
    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }
    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

}
