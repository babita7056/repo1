//12. Write a program to demonstrate type promotion in arithmetic operations.
public class TypePromotionDemo {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        int result = a + b;  
        System.out.println("Result (byte + byte promoted to int) = " + result);
        char c = 'A'; 
        int sum = c + 1; 
        System.out.println("char + int result = " + sum);
    }
}
