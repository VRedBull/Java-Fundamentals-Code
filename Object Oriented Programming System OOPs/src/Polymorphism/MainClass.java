package Polymorphism;

import java.util.*;

//public class MainClass {
//    public static void main(String...args){
//
//        Dog d = new Dog();
//        d.walk();
//        Pet p = d;
//        p.walk();
//
//    }
//}
// Java program to demonstrate
// Upcasting Vs Downcasting

// Parent class
//class Parent {
//    String name;

    // A method which prints the
    // signature of the parent class
//    void method()
//    {
//        System.out.println("Method from Parent");
//    }
//}

// Child class
//class Child extends Parent {
//    int id;

    // Overriding the parent method
    // to print the signature of the
    // child class
//    @Override
//    void method()
//    {
//        System.out.println("Method from Child");
//    }
//}

// Demo class to see the difference
// between upcasting and downcasting
public class MainClass {

    public static void main(String...args){
        Vikas v = new Vikas(19, "Vikas");
        Object o = new Vikas();
        Vivaan v1 = new Vivaan();
        System.out.println(v instanceof Vikas);
        System.out.println( o instanceof Vikas );
        //System.out.println(v1 instanceof );

    }


    // Driver code
//    public static void main(String[] args)
//    {
//        // Upcasting
//        Parent p = new Parent();
//        p.name = "GeeksforGeeks";

    // This parameter is not accessible
    // p.id = 1;
//        System.out.println(p.name);
//        p.method();

    // Trying to Downcasting Implicitly
    // Child c = new Parent(); - > compile time error

    // Downcasting Explicitly
//        Child c = (Child)p;
//
//        c.id = 1;
//        System.out.println(c.name);
//        System.out.println(c.id);
//        c.method();
//    }
//}

}

class Vikas{

    int age;
    String name;

    Vikas(){

    }

    Vikas(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String toString(){
      return   age+" " + name;
    }


}

class Vivaan {
    int age;
    String name;

}