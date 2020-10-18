package Methods;

public class PassByValue {

    public static void main(String...args){
        Dog jim = new Dog();
        jim.legs = 4;
        System.out.println("Original no. of legs="+jim.legs);
        fun(jim);
        System.out.println("After calling the fun method no. of legs="+jim.legs);
    }

    static void fun(Dog a){
        a.legs = 6;
    }
}

class Dog{
    int legs;
}
