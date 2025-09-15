//5.Write a program to find vowels and consonants in a string and display the count of  Vowels and Consonants in the string

package StringLevel2;
import java.util.Scanner;   
public class FindVowelsAndConsonents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        int[] counts = findVowelsAndConsonants(inputString);
        
        System.out.println("Number of Vowels: " + counts[0]);
        System.out.println("Number of Consonants: " + counts[1]);
        
        scanner.close();
    }
    public static String checkVowelOrConsonant(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32); 
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }
    public static int[] findVowelsAndConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String result = checkVowelOrConsonant(currentChar);
            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }
        
        return new int[]{vowelCount, consonantCount};
    }

}
