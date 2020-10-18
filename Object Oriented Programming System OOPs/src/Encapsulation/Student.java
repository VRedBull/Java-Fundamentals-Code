package Encapsulation;

public class Student {
    private int age;
    private String name;

    public int getAge(){        //This is the getter method
        return age;
    }
    public void setAge(int age){       //This is the setter method
        if(age>20){
            System.out.println("You are too old");
        }
        else{
            this.age = age;
        }
    }

}
