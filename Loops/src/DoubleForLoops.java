import java.util.*;
public class DoubleForLoops {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int height, width;
        System.out.print("Enter height=");
        height = sc.nextInt();
        System.out.print("Enter width=");
        width=sc.nextInt();
//        for (int c1=1; c1<=height; c1++){
//            for(int c2=1; c2<=width; c2++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        System.out.print("+");
//        for (int horizontal=1;horizontal<=width; horizontal++ ){
//            System.out.print("-");
//        }
//        System.out.println("+");
//        for(int vertical=1; vertical<=height; vertical++){
//            System.out.print("|");
//            for (int x=1;x<=width; x++){
//                System.out.print("#");
//            }System.out.println("|");
//        }
//        System.out.print("+");
//        for(int hor=1;hor<=width; hor++){
//            System.out.print("-");
//        }System.out.println("+");
//
//        for (int x=1; x<=height; x++){
//            width--;
//            for(int y=width; y>=1; y--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        int a=0;
        for(int x=1; x<=height; x++ ){
            for(int y=0; y<=width-(width-a); y++){
                System.out.print("*");
            }
            System.out.println();
            a++;
        }


    }
}
