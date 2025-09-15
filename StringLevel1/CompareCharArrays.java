package StringLevel1;

import java.util.Scanner;
import java.util.Arrays;

public class CompareCharArrays {
    public static char[] getCharacters(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }
        return result;
    }
    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] customChars = getCharacters(text);
        char[] builtInChars = text.toCharArray();
        boolean areEqual = compareArrays(customChars, builtInChars);

        System.out.println("User define method characters: " + Arrays.toString(customChars));
        System.out.println(" built-in method characters: " + Arrays.toString(builtInChars));
        System.out.println("Are both arrays equal? " + areEqual);

        sc.close();
    }
}
