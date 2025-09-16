//3.Problem Statement: 	Create a PalindromeChecker class with an attribute text. Add methods to:
package ClassAndObjectLevel2;
import java.util.Scanner;
class PalindromeChecker {
    String text;
    PalindromeChecker(String text) {
        this.text = text;
    }
    boolean isPalindrome() {
        String cleaned = text.replaceAll("\\s+", "").toLowerCase();
        int left = 0, right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + text + "\" is NOT a Palindrome.");
        }
    }
}
public class PalindromeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text to check palindrome: ");
        String input = sc.nextLine();
        PalindromeChecker checker = new PalindromeChecker(input);
        checker.displayResult();
        sc.close();
    }
}

