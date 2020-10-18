package Inheritance;

class Calculator{       //Super class or Parent class
    public int add(int i, int j){
        return i+j;
    }
}
class CalcAdv extends Calculator{       //Subclass or child class
    public int sub(int i, int j){
        return i-j;
    }
}

//MultiLevel Inheritance
class CalcVeryAdv extends CalcAdv{
    public int multi(int i, int j){
        return i*j;
    }
}

public class SimpleInheritance {
    public static void main(String...ars){
        CalcVeryAdv c1 = new CalcVeryAdv();
        System.out.println(c1.add(1,2));
        System.out.println(c1.sub(3,2));
        System.out.println(c1.multi(4,5));
    }
}
