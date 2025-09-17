//2.Write a Circle class with a radius attribute. Use constructor chaining to initialize radius with default and user-provided values.
package ConstructorLevel1;

 public class Circle {
    double radius;
    Circle(){
        this(1.0);
    }
    Circle(double radius){
        this.radius=radius;
    }
    void display(){
         System.out.println("Radius=" +radius);
        System.out.println("Area=" +(Math.PI*radius*radius));
    }
    public static void main(String[]args){
        Circle obj=new Circle(2.0);
        Circle obj1=new Circle();
        obj.display();
        obj1.display();
        
    }
}
