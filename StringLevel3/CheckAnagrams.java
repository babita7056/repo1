//8.Write a program to check if two texts are anagrams and display the result 

package StringLevel3;
import java.util.Scanner;
public class CheckAnagrams {
    public static boolean checkAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            freq1[str1.charAt(i)]++;
            freq2[str2.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first text: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second text: ");
        String str2 = scanner.nextLine();
        boolean result = checkAnagrams(str1, str2);
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }
        scanner.close();
    }
}
