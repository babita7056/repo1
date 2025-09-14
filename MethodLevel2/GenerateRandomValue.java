//12.Write a program that generates five 4 digit random values and then finds their average value, and their minimum and maximum value. Use Math.random(), Math.min(), and Math.max().
package MethodLevel2;
import java.util.Scanner;
public class GenerateRandomValue {
    public static void main(String[] args) {
        int size = 5;
        int[] randomNumbers = generateDigitRandArr(size);
        
        System.out.println("Generated 4-digit random numbers:");
        for (int number : randomNumbers) {
            System.out.println(number);
        }
        
        double[] results = findAvgMinMax(randomNumbers);
        System.out.printf("Average: %.2f\n", results[0]);
        System.out.println("Minimum: " + (int)results[1]);
        System.out.println("Maximum: " + (int)results[2]);
    }
    public static int[] generateDigitRandArr(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = 1000 + (int)(Math.random() * 9000); 
        }
        return randomNumbers;
    }
    public static double[] findAvgMinMax(int[] numbers) {
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        
        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }
        
        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

}
