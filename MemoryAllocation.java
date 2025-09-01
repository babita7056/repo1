//15. Write a program to show memory allocation difference between primitive and reference variables.
public class MemoryAllocation {
    public static void main(String[] args) {
        int x = 10;                 
        int[] arr = {1, 2, 3};     
        System.out.println("Primitive int x = " + x);
        System.out.println("Reference variable arr points to heap: " + arr);
    }
}
