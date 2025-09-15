//2.Find unique characters in a string using the charAt() method and display the result 
package StringLevel3;
import java.util.Scanner;
public class UniqeChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();
        
        char[] uniqueChars = findUniqueCharacters(text);
        
        System.out.println("Unique characters:");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        
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

    
}
