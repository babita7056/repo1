//16. Write a program to demonstrate the use of a static final variable (constant).
public class StaticFinalDemo {
    static final double PI = 3.14159;  

    public static void main(String[] args) {
        double r = 7;
        double area = PI * r * r;
        System.out.println("Area of circle = " + area);
    }
}
