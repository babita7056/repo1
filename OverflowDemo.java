//18. Write a program to demonstrate numeric overflow in Java
public class OverflowDemo {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE; 
        System.out.println("Max int = " + max);
        System.out.println("After overflow = " + (max + 1));
    }
}
