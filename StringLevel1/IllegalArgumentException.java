package StringLevel1;
import java.util.Scanner;
public class IllegalArgumentException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        generateException(text);
        handleException(text);
        sc.close();
    }
    public static void generateException(String text) {
        System.out.println(text.substring(10, 5));
    }
    public static void handleException(String text) {
        try {
            System.out.println(text.substring(10, 5));
        } catch (Exception e) {
            System.out.println("IllegalArgument Exception ");
        }
    }
}
