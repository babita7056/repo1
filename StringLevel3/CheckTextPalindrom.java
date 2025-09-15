// 7.Write a program to to check if a text is palindrome and display the result
package StringLevel3;
import java.util.Scanner;
public class CheckTextPalindrom {
  public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }
    public static char[] reverseUsingCharAt(String text) {
        int len = text.length();
        char[] reversed = new char[len];
        for (int i = 0; i < len; i++) {
            reversed[i] = text.charAt(len - 1 - i);
        }
        return reversed;
    }
    public static boolean isPalindrome(String text) {
        char[] reversed = reverseUsingCharAt(text);
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != reversed[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String text = sc.nextLine();
        boolean result1 = isPalindromeIterative(text);
        boolean result2 = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean result3 = isPalindrome(text);
        System.out.println("Using Iterative Logic: " + result1);
        System.out.println("Using Recursive Logic: " + result2);
        System.out.println("Using Character Array Logic: " + result3);
        sc.close();
    }


}
