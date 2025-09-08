//3.Write a program that takes the temperature in Celsius as input and converts it to Fahrenheit using the formula:
package practice;
import java.util.Scanner;
public class fahrenheittoCelsius {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in); 
        System.out.println("enter temperature");
     double Celsius=sc.nextDouble();
     double Fahrenheit = (Celsius * 9/5) + 32;
     System.out.println("convert into fahrenheut:"+Fahrenheit);
    }
}
