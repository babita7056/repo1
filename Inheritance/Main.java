//1.Animal Hierarchy
package Inheritance;

 class Animal {
    String name;
    int age;

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
    
    void makeSound(){
        System.out.println("Animal makes a sound");
    }
    
}
class Dog extends Animal{
    @Override
    void display() {
        super.display();
    }
    @Override
    void makeSound(){
        System.out.println("Dog barks:");
    }
}
class Cat extends Animal{
    @Override
    void display(){
        super.display();
    }
    @Override
    void makeSound(){
        System.out.println("Cat meows:");
    }
}
class Bird extends Animal{
    @Override
    void display(){
        super.display();
    }
    @Override
    void makeSound(){
        System.out.println("Bird chirps:");
    }
}
public class Main{
public static void main(String[] args) {
    Animal a = new Animal();
    a.makeSound();
    Dog d = new Dog();
    d.name = "Fido";
    d.age = 3;
    d.display();
    d.makeSound();
    Cat c = new Cat();
    c.name = "Fluffy";
    c.age = 2;
    c.display();
    c.makeSound();
    Bird b = new Bird();
    b.name = "Tweety";
    b.age = 1;
    b.display();
    b.makeSound();
}
}
