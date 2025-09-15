//4.Write a program to split the text into words and find the shortest and longest strings in a given text

package StringLevel2;
import java.util.Scanner;
public class FindShortestAndLongest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();
        
        String[] words = splitTextWithoutMethod(inputText);
        String[][] wordsWithLengths = getWordWithLength(words);
        String[] shortestAndLongest = findShortestAndLongest(wordsWithLengths);
        
        System.out.println("Shortest word: " + shortestAndLongest[0]);
        System.out.println("Longest word: " + shortestAndLongest[1]);
        
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
    public static String[] findShortestAndLongest(String[][] wordsWithLengths) {
        if (wordsWithLengths.length == 0) return new String[]{"", ""};
        
        String shortest = wordsWithLengths[0][0];
        String longest = wordsWithLengths[0][0];
        int minLength = Integer.parseInt(wordsWithLengths[0][1]);
        int maxLength = Integer.parseInt(wordsWithLengths[0][1]);
        
        for (int i = 1; i < wordsWithLengths.length; i++) {
            int currentLength = Integer.parseInt(wordsWithLengths[i][1]);
            if (currentLength < minLength) {
                minLength = currentLength;
                shortest = wordsWithLengths[i][0];
            }
            if (currentLength > maxLength) {
                maxLength = currentLength;
                longest = wordsWithLengths[i][0];
            }
        }
        
        return new String[]{shortest, longest};
    }

}
