package Inheritance;

public class Teacher extends Person {
    public Teacher(String name) {
        super(name);
    }

    public void teach(){
        System.out.println(name+" Teaching a class");
    }
    public void eat(){
        System.out.println("teacher "+name+ " Eating now");
    }
}
