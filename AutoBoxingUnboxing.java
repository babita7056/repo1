public class AutoBoxingUnboxing {
    public static void main(String[] args) {
        int a = 10;
        Integer obj = a;   
        System.out.println("Autoboxing: " + obj);
        Integer b = 20;
        int num = b;      
        System.out.println("Unboxing: " + num);
    }
}
