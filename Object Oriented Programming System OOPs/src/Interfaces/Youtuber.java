package Interfaces;

public interface Youtuber extends as,df{
    void uploadVid();
    default void edit(){
        System.out.println("youtuber editing videos.");
    }
}
