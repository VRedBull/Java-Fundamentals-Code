package ExceptionPacakage;

public class Exception {
    public static void main(String[]args){
        f1();
    }

    public static void f1()
    {
        try
        {
            f2();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage()+" occurred");
        }

    }
    public static void f2() throws ArrayIndexOutOfBoundsException{
        boolean isDanger = true;
        if(isDanger){
            throw new ArrayIndexOutOfBoundsException("ERROR!!!!!!");
        }
    }
}


