package Inheritance;

public class Person {
    protected String name;


    public Person(String name){
        System.out.println("Inside the Person Constructor");
    }

    public void eat(){
        System.out.println(name+ " Eating now");
    }
    public void sleep(){
        System.out.println(name+" Sleeping now");
    }
    public void walk(){
        System.out.println(name+" Walking now");
    }
}
