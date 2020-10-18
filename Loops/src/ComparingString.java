import java.util.*;
public class ComparingString {
    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
        String a,b;
        a="prefix";
        b="suffix";
        int n=1;
    for(int i=1; i<=n; i++){
        System.out.print("What do you wanna test=");
        String ps=sc.nextLine();
        boolean x,y;
        x=a.equals(ps);
        y=b.equals(ps);
        if(x==true){
           System.out.print("Enter your word with a prefix=");
           String ss= sc.nextLine();
           System.out.print("Enter your prefix=");
           String ts=sc.nextLine();
           prefix(ss,ts);
       }else if(y==true){
           System.out.print("Enter your word with a suffix=");
           String se= sc.nextLine();
           System.out.print("Enter your suffix=");
           String te=sc.nextLine();
           suffix(se,te);
       } else{
           System.out.println("Invalid input");
            n++;
       }
    }
    }
    public static void prefix(String s1, String t1){
        boolean x=s1.startsWith(t1);
        System.out.print("You have entered a "+x+" prefix.");
    }
    public static void suffix(String s2, String t2){
        boolean y=s2.endsWith(t2);
        System.out.print("You've entered "+y+" suffix.");
    }
}
