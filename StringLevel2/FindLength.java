//1.Write a program to find and return the length of a string without using the length() method 

package StringLevel2;
import java.util.Scanner;
public class FindLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.next();
        
        int lengthWithoutMethod = findLengthWithoutMethod(inputString);
        int lengthWithMethod = inputString.length();
        
        System.out.println("Length of the string without using length() method: " + lengthWithoutMethod);
        System.out.println("Length of the string using length() method: " + lengthWithMethod);
        
        scanner.close();
    }
    public static int findLengthWithoutMethod(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
           
        }
        return count;
    }
}
