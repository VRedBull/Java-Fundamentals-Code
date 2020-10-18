package ClassesAndObjects;



public class ClassObjects {
    public static void main(String... args) {

//            Cat cat1 = new Cat();       //Creating a object cat1 of Class Cat
//            Cat cat2 = new Cat();       //Creating a object cat2 of Class Cat
//
//            //Using the description method of class Cat for different objects
//            cat1.eat();
//            cat2.walk();
//
//            //Using the legs property of class Cat
//
//            cat1.legs = 3;
//            cat2.legs = 4;
//
//            cat1.eyes = 2;
//            cat2.eyes = 3;
//
//            cat1.name = "Jimmy";
//            cat2.name = "Fury";
//
//            cat1.hasFur = false;
//            cat2.hasFur = true;
//
//            //Using the description method of class Cat for different objects
//            cat1.description();
//            cat2.description();
//
//        }

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.name = "Tom";
        dog2.name = "Jerry";

        dog1.jump();
        dog2.jump();

        dog1.description();
        dog2.description();

    }
}
class Cat{
    int legs, eyes;     //Properties of Cat class
    String name;
    boolean hasFur;

    public void eat(){
        System.out.println("Your cat is eating.");
    }
    public void walk(){
        System.out.println("Your cat is sleeping.");
    }
    public void description(){
        System.out.printf("Your cat %s is with %d legs and %d.%n",name, legs, eyes);
    }

}

class Dog{
    String breed, name;
    public void jump(){
        System.out.println("You Dog named "+name+" has jumped");
    }
    public void description(){
        System.out.println("The name of dog is "+name+"it's breed is "+breed+".");
    }
}

