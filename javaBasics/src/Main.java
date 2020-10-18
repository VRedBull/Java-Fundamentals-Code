import javax.print.DocFlavor;
import java.util.*;
public class Main{
    public static void main (String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first animal=");
        String xx=sc.nextLine();
        had(xx);
    System.out.print("Enter the sound your animal makes=");
    String x1=sc.nextLine();
        System.out.print("Enter the sound your animal makes=");
        String y1=sc.nextLine();
    mcDon(x1,y1);
        System.out.print("Enter the 2nd animal=");
        String yy=sc.nextLine();
        had(yy);
        System.out.print("Enter the sound your animal makes=");
        String x2=sc.nextLine();
        System.out.print("Enter the sound your animal makes=");
        String y2=sc.nextLine();
        mcDon(x2,y2);
        System.out.print("Enter the 3rd animal=");
        String zz=sc.nextLine();
        had(zz);
        System.out.print("Enter the sound your animal makes=");
        String x3=sc.nextLine();
        System.out.print("Enter the sound your animal makes=");
        String y3=sc.nextLine();
        mcDon(x3,y3);


    }
    public static void had(String name){
        System.out.println(" 'And on his farm he had a "+name+" EIEIO' ");
    }

    public static void mcDon(String x,String y){
        System.out.println(" 'With an "+x+","+y+" here' ");
        System.out.println(" 'And a "+x+","+y+" there' ");

    }
}
