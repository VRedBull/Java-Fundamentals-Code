import java.util.*;
public class Printf {
//    public static void main(String[]args){
////        System.out.printf("Mess=%10.3s-Mike","asdasdasjfhskjafhksdf");
////        String s="asdasd";
////        System.out.println(s.length());
//
//        format("lol","asd");
//    }
//    public static void format(String fmt, String message){
//        System.out.printf("%10s|",fmt);
//        System.out.printf(fmt,message);
//        System.out.printf(":");
////    }
//    public static void main(String[]args){
//        long num=1231239874365L;
//        format("%d",num);
//        format("%010d",num);
//        format("%,d",num);
//    }
//    public static void format(String fmt, long n){
//        System.out.printf("%-10s|", fmt);
//        System.out.printf(fmt, n);
//        System.out.println();
//    }
    public static void main(String[]args){

        int a,b,c;
        a=1;
        b=1;

        for(int i=1; i<=80; i++){
            for(int n=1; n<=80; n++){
                System.out.printf("%s",n);
            }
            System.out.printf("%-10d%n",a);
            System.out.printf("%-100d",b);
            c=a+b;
            a=b;
            b=c;
        }

    }
}
