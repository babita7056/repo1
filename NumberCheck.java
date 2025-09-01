//6. Write a program to check whether a number is positive, negative, or zero.
public class NumberCheck {
    public static void main(String[] args) {
        int num = -5;  

        if (num > 0) {
            System.out.println(num + " is Positive");
        } else if (num < 0) {
            System.out.println(num + " is Negative");
        } else {
            System.out.println(num + " is Zero");
        }
    }
}
