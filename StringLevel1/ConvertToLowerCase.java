package StringLevel1;
import java.util.Scanner;
public class ConvertToLowerCase {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string ");
            String text = sc.nextLine();
            String lowercase = convertToLowercase(text);
            boolean areEqual = compareStrings(text, lowercase);
            System.out.println("Original text " + text);
            System.out.println("Lowercase text " + lowercase);
            System.out.println("Are both strings equal " + areEqual);
            sc.close();
        }

        public static String convertToLowercase(String text) {
            String lowercase = "";
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
                    lowercase += (char) (text.charAt(i) + 'a' - 'A');
                } else {
                    lowercase += text.charAt(i);
                }
            }
            return lowercase;
        }
        public static boolean compareStrings(String text, String lowercase) {
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) != lowercase.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
}
