package Interfaces;

public interface Student {
    void study();
    default void exams(){
        System.out.println("Student is giving exam.");
    }
}