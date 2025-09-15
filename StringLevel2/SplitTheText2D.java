//3.Write a program to split the text into words and return the words along with their lengths in a 2D array

package StringLevel2;
import java.util.Scanner;
public class SplitTheText2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();
        
        String[] words = splitTextWithoutMethod(inputText);
        String[][] wordsWithLengths = getWordWithLength(words);
        
        System.out.printf("%-20s %-10s%n", "Word", "Length");
        System.out.println("-------------------- ----------");
        for (String[] wordInfo : wordsWithLengths) {
            System.out.printf("%-20s %-10d%n", wordInfo[0], Integer.parseInt(wordInfo[1]));
        }
        
        scanner.close();
    }
    public static String[] splitTextWithoutMethod(String text) {
        int wordCount = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        
        String[] words = new String[wordCount];
        int wordIndex = 0;
        StringBuilder currentWord = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (currentChar != ' ') {
                currentWord.append(currentChar);
            } else {
                words[wordIndex] = currentWord.toString();
                wordIndex++;
                currentWord.setLength(0);
            }
        }
        words[wordIndex] = currentWord.toString(); 
        
        return words;
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
    public static String[][] getWordWithLength(String[] words) {
        String[][] wordsWithLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordsWithLengths[i][0] = words[i];
            wordsWithLengths[i][1] = String.valueOf(findLengthWithoutMethod(words[i]));
        }
        return wordsWithLengths;
    }

}
