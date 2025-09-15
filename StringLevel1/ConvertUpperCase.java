package StringLevel1;
import java.util.Scanner;
public class ConvertUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string ");
        String text = sc.nextLine();
        String uppercase = convertToUppercase(text);
        boolean areEqual = compareStrings(text, uppercase);
        System.out.println("Original text " + text);
        System.out.println("Uppercase text " + uppercase);
        System.out.println("Are both strings equal " + areEqual);
        sc.close();
    }
    public static String convertToUppercase(String text) {
        String uppercase = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
                uppercase += (char) (text.charAt(i) - 'a' + 'A');
            } else {
                uppercase += text.charAt(i);
            }
        }
        return uppercase;
    }
    public static boolean compareStrings(String text, String uppercase) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != uppercase.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    
}
