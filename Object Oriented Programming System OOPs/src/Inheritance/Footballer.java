package Inheritance;

public class Footballer extends Person{

    public Footballer(String name){
        super(name);    //This called the Parent class
        System.out.println("Inside Football Constructor");

    }

    public void playsFootball(){
        System.out.println(name+" Playing football");
    }
    public void eat(){
        System.out.println("Footballer "+name+ " Eating now");
        super.eat();

    }
}
