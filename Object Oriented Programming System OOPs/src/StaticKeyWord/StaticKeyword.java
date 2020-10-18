package StaticKeyWord;
class Emp{
    int eId;
    int salary;
    static String ceo;

    static{     //This is static block used for static values
        ceo = "pradhan";
        System.out.println("static");       //The static block is is executed only once for a class
    }
    public Emp(){      //This is used for when you create an object
        eId = 1;
        salary = 2000;
        System.out.println("Constructor");      //The Emp class is executed for every objected created
    }

    public void info(){
        System.out.printf("%d : %d : %s%n",eId,salary,ceo);
    }
}
public class StaticKeyword {
    public static void main(String...args){
        Emp vikas = new Emp();


        Emp vivaan = new Emp();


        vikas.info();
        vivaan.info();

    }
}
