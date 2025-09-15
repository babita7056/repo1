//4.Write a program to find the frequency of characters in a string using the charAt() method and display the result  

package StringLevel3;
import java.util.Scanner;
public class FrequencyOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();
        char[] uniqueChars = findUniqueCharacters(text);
        int[][] frequency = calculateFrequency(text, uniqueChars);
        displayFrequency(frequency, uniqueChars);
        sc.close();
    }
    public static char[] findUniqueCharacters(String text) {
        int textLength = text.length();
        char[] uniqueChars = new char[textLength];
        int uniqueCharIndex = 0;
        for (int i = 0; i < textLength; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < uniqueCharIndex; j++) {
                if (currentChar == uniqueChars[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueChars[uniqueCharIndex] = currentChar;
                uniqueCharIndex++;
            }
        }
        char[] result = new char[uniqueCharIndex];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCharIndex);
        return result;
    }
    public static int[][] calculateFrequency(String text, char[] uniqueChars) {
        int[][] frequency = new int[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            int count = 0;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == uniqueChars[i]) {
                    count++;
                }
            }
            frequency[i][0] = uniqueChars[i];
            frequency[i][1] = count;
        }
        return frequency;
    }
    public static void displayFrequency(int[][] frequency, char[] uniqueChars) {
        System.out.println("Character\tFrequency");
        for (int i = 0; i < frequency.length; i++) {
            System.out.println(uniqueChars[i] + "\t\t" + frequency[i][1]);
        }
    }
   
}
