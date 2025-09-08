package practice;
// Demonstration of various types of operators in Java
import java.util.Scanner;
public class OperatorsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integers:");
        int a=scanner.nextInt();
        int b=scanner.nextInt();    
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); 
        System.out.println("a - b = " + (a - b)); 
        System.out.println("a * b = " + (a * b)); 
        System.out.println("a / b = " + (a / b)); 
        System.out.println("a % b = " + (a % b)); 

        
        System.out.println("\nRelational Operators:");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y : " + (x && y)); 
        System.out.println("x || y : " + (x || y));
        System.out.println("!x     : " + (!x));

        
        System.out.println("\nBitwise Operators:");
        System.out.println("a & b  = " + (a & b)); 
        System.out.println("a | b  = " + (a | b));  
        System.out.println("a ^ b  = " + (a ^ b));  
        System.out.println("~a     = " + (~a));     
        System.out.println("a << 1 = " + (a << 1)); 
        System.out.println("a >> 1 = " + (a >> 1)); 

        System.out.println("\nAssignment Operators:");
        System.out.println("Enter an integer for assignment operations:");
        int c = scanner.nextInt();
        System.out.println("Initial c = " + c);
        c += 5; System.out.println("c += 5 -> " + c);
        c -= 3; System.out.println("c -= 3 -> " + c);
        c *= 2; System.out.println("c *= 2 -> " + c);
        c /= 4; System.out.println("c /= 4 -> " + c);
        c %= 3; System.out.println("c %= 3 -> " + c);
        
        System.out.println("\nUnary Operators:");
        System.out.println("Enter an integer for unary operations:");   
        int d = scanner.nextInt();
        System.out.println("d++ : " + (d++)); 
        System.out.println("++d : " + (++d)); 
        System.out.println("d-- : " + (d--)); 
        System.out.println("--d : " + (--d)); 
        System.out.println("-d  : " + (-d));  
        System.out.println("+d  : " + (+d));  

      
        System.out.println("\nConditional (Ternary) Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b is: " + max);

       
        System.out.println("\ninstanceof Operator:");
        String str = "Hello";
        System.out.println("str instanceof String: " + (str instanceof String));
    }
}

