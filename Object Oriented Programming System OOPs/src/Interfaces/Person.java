package Interfaces;

public class Person implements Youtuber,Student {
    public static void main(String...args) {
        Person p = new Person();

        Youtuber y = p;     //Upcasting so y object have access to methods of Youtuber interface but this
        Student s = p;      //an object of Person class.

        p.uploadVid();
        p.study();

        y.edit();
        s.exams();
    }

    @Override
    public void uploadVid(){
        System.out.println("Person is gonna upload videos.");
    }

    @Override
    public void study(){
        System.out.println("Person is gonna study.");
    }
}


