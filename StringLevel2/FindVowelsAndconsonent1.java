//6.Write a program to find vowels and consonants in a string and display the character type - Vowel, Consonant, or Not a Letter

package StringLevel2;
import java.util.Scanner;

public class FindVowelsAndconsonent1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        String[][] charTypes = findVowelsAndConsonants(inputString);
        
        System.out.printf("%-10s %-15s%n", "Character", "Type");
        System.out.println("---------- ---------------");
        for (String[] charInfo : charTypes) {
            System.out.printf("%-10s %-15s%n", charInfo[0], charInfo[1]);
        }
        
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
    public static String[][] findVowelsAndConsonants(String str) {
        String[][] charTypes = new String[str.length()][2];
        
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String type = checkVowelOrConsonant(currentChar);
            charTypes[i][0] = String.valueOf(currentChar);
            charTypes[i][1] = type;
        }
        
        return charTypes;
    }

}
