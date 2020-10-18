package Methods;

public class MethodsIntro {
    public static void main(String...args){
        int addition = operation(4,5);
        double divide = operation(4.0,5.0);
        System.out.println("addition = "+addition + " division = "+divide);
        operation(2,3,4);
    }
    static int operation( int a, int b){
        return a+b;
    }
    static double operation(double a, double b){
        return a/b;
    }
    static void operation( int x, int y, int z){
        System.out.println("multiplied = "+x+"*"+y+"*"+"*"+z+"="+x*y*z);
    }

}
