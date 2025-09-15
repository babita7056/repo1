//7.Write a program to trim the leading and trailing spaces from a string using the charAt() method 
package StringLevel2;
import java.util.Scanner;
public class TrimLeadingSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with leading and trailing spaces: ");
        String inputString = scanner.nextLine();
        
        int[] trimIndices = trimSpaces(inputString);
        String trimmedString = substringWithoutMethod(inputString, trimIndices[0], trimIndices[1]);
        String builtInTrimmedString = inputString.trim();
        
        boolean areEqual = compareStrings(trimmedString, builtInTrimmedString);
        
        System.out.println("Trimmed string using custom method: '" + trimmedString + "'");
        System.out.println("Trimmed string using built-in method: '" + builtInTrimmedString + "'");
        System.out.println("Are both trimmed strings equal? " + areEqual);
        
        scanner.close();
    }
    public static int[] trimSpaces(String str) {
        int start = 0;
        int end = str.length() - 1;
        
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        
        return new int[]{start, end + 1}; 
    }
    public static String substringWithoutMethod(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

}
