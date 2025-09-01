//19. Write a program to check if a long value can be stored in a float variable and display the result.
public class LongToFloatCheck {
    public static void main(String[] args) {
        long val = 9223372036854775807L; 
        float f = val; 
        System.out.println("long: " + val);
        System.out.println("Stored in float: " + f);
    }
}
