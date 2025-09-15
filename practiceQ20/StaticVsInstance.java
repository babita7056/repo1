//13. Write a program to show the difference between static and instance variables.
public class StaticVsInstance {
    static int staticVar = 100;  
    int instanceVar = 50;        
    public static void main(String[] args) {
        StaticVsInstance obj1 = new StaticVsInstance();
        StaticVsInstance obj2 = new StaticVsInstance();

        obj1.instanceVar = 75;
        obj2.instanceVar = 150;
        staticVar = 200; 
        System.out.println("obj1: instanceVar=" + obj1.instanceVar + ", staticVar=" + staticVar);
        System.out.println("obj2: instanceVar=" + obj2.instanceVar + ", staticVar=" + staticVar);
    }
}
