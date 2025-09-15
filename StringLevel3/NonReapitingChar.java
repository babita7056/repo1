//3.Write a program to find the first non-repeating character in a string and show the result

package StringLevel3;
import java.util.Scanner;
public class NonReapitingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();
        char nonRepeatingChar = FirstNonRepeatingChar(text);
        System.out.println("first non-repeating character in the text is: " + nonRepeatingChar);
        sc.close();
    }
    
    public static char FirstNonRepeatingChar(String text) {
        int[] frequency = new int[256];
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }
        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        return '\0'; 
    }
}
