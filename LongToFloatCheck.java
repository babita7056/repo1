public class LongToFloatCheck {
    public static void main(String[] args) {
        long val = 9223372036854775807L; 
        float f = val; 
        System.out.println("long: " + val);
        System.out.println("Stored in float: " + f);
    }
}
