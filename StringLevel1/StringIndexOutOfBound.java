package StringLevel1;
import java.util.Scanner;
public class StringIndexOutOfBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        generateException(text);
        handleException(text);
        sc.close();
    }
    public static void generateException(String text) {
        System.out.println(text.charAt(text.length()));
    }
    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (Exception e) {
            System.out.println("String Exception ");
        }
    }
}
