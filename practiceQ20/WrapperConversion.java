//14. Write a program to use wrapper class methods to convert numbers to binary and hexadecimal.
public class WrapperConversion {
    public static void main(String[] args) {
        int num = 42;

        String binary = Integer.toBinaryString(num);
        String hex = Integer.toHexString(num);

        System.out.println("Number: " + num);
        System.out.println("Binary: " + binary);
        System.out.println("Hexadecimal: " + hex);
    }
}
