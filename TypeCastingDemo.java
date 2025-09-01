//8. Write a program to demonstrate implicit and explicit type casting.
public class TypeCastingDemo {
    public static void main(String[] args) {
        int x = 10;
        double y = x;  
        System.out.println("Implicit casting int -> double: " + y);

        double d = 9.78;
        int i = (int) d;  
        System.out.println("Explicit casting double -> int: " + i);
    }
}
