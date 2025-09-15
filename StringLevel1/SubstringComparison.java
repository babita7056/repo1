package StringLevel1;
import java.util.Scanner;

public class SubstringComparison {
    public static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String substringCharAt = createSubstring(text, start, end);
        String substringBuiltIn = text.substring(start, end);
        boolean areEqual = compareStrings(substringCharAt, substringBuiltIn);

        System.out.println("Substring using charAt() " + substringCharAt);
        System.out.println("Substring using built-in method " + substringBuiltIn);
        System.out.println("Are both substrings equal " + areEqual);

        sc.close();
    }
}

