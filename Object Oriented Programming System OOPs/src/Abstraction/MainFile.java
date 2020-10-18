package Abstraction;

public class MainFile {
    public static void main(String...args){

    }
}

abstract class Test{

    public abstract void m1();
    public  void m2(){
        System.out.println("jn");
    }
}

abstract class SubTest extends Test{
    public void m1(){}
    //public void m2(){}
}

class SubSubTest extends Test{
    public void m1(){}
    //public void m2(){}
}

