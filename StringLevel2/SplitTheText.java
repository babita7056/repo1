//2.Write a program to split the text into words, compare the result with the split() method and display the result 

package StringLevel2;
import java.util.Scanner;
public class SplitTheText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();
        
        String[] wordsWithoutMethod = splitTextWithoutMethod(inputText);
        String[] wordsWithMethod = inputText.split(" ");
        
        System.out.println("Words without using split() method:");
        for (String word : wordsWithoutMethod) {
            System.out.println(word);
        }
        
        System.out.println("Words using split() method:");
        for (String word : wordsWithMethod) {
            System.out.println(word);
        }
        
        boolean areEqual = compareStringArrays(wordsWithoutMethod, wordsWithMethod);
        System.out.println("Are both methods producing the same result? " + areEqual);
        
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
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

}
