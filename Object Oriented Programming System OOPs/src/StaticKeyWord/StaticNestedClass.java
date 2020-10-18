package StaticKeyWord;

public class StaticNestedClass {
//    A objA = new A();
//    A.B objB = objA.new B();
//    A.C objC = new A.C();
//}
//
//class A {
//    class B{
//
//    }
//    static class C {
//
//    }

    static{
    System.out.println("static 1");
}
    static{
        System.out.println("static 2");
    }
    public static  void main(String...args){
        System.out.println("method");
    }
    static{
        System.out.println("static 3");
    }
}
