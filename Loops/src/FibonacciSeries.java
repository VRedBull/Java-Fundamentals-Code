import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter till what you wanna print your Fibbonaci Series=");
        int n=sc.nextInt();
        int a,b,c;
        a=1;
        b=1;
                                                  //1 1 2 3 5 8
        System.out.println(a);
        System.out.println(b);
        for(int x=1; x<=n; x++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
