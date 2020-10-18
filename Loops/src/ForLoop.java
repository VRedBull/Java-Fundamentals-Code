import javax.swing.plaf.nimbus.AbstractRegionPainter;
import java.text.BreakIterator;
import java.util.Scanner;

public class ForLoop {
//    public static final double BMI1=23.1231;
//    public static void main(String[]args){
//        int i;
//        for (i=1;i<=2;i+=1){
//            System.out.println("This round is "+i);
//            oneInt();
//        }
//    }
//    public static double BMI( double height, double weight){
//        return BMI1*height*weight;
//    }
//    public static void oneInt(){
//        double weight, height;
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter weight=");
//        weight = sc.nextDouble();
//        System.out.print("Enter height=");
//        height=sc.nextDouble();
//        double bmi=BMI(height,weight);
//        System.out.println("Your BMI is="+bmi);
//    }

    public static void main(String[] args) {
//        int start;
////        int count;
////        {
////            System.out.println("--Loop Number 1--");
////            System.out.println("count = 10; count>=1; count-- ");
////            for (count =10; count>=1; count--){
////                System.out.print(" "+count);
////            }
////        }
////        {
////            System.out.println("\n--Loop Number 2--");
////            System.out.println("count = 10; count>0; count-=2 ");
////            for (count =10; count>0; count-=2){
////                System.out.print(" "+count);
////            }
////        }
//        int pro;
//
//        pro=0;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter you start value=");
//        start=sc.nextInt();
//        System.out.print("Enter you End variable=");
//        int end=sc.nextInt();
//        for ( int value=start; value<=end; value++){
//
//               pro+=value;
//        }
////        int x=start*(start-1)/2;
////        System.out.printf("The Sum between 1 and %d is=%d%n",start,x);
//        System.out.println(pro);
//        System.out.println("Booooom");
//
//
////        for(int a = 8;a<=8;a++){
////            double x=loop(a);
////            System.out.println(x);
////        }
////    }
////    public static double loop(int count){
////        return count;
////    }
////
////        loop1();
////    }
////    public static void loop(){
////        double sum, rand;
////        sum = 0;
////        Scanner sc = new Scanner(System.in);
////        System.out.print("Enter the no. of times random number to be generated=");
////        int N = sc.nextInt();
////        for (int round = 1; round <= N; round++) {
////            System.out.println("This is round " + round);
////            rand = Math.random();
////            System.out.println("Random integer is=" + rand);
////            sum += rand;
////
////        }
////        System.out.println("Sum of random integers is=" + sum);
////        double x = sum / N;
////        System.out.println("Average of N no. of random numbers is=" + x);
////        loop1();
////    }
////    public static void loop1(){
////        Scanner key=new Scanner(System.in);
////        System.out.print("Enter no. of times you want to execute loop()=");
////        int N1=key.nextInt();
////
////        for (int x1=1;x1<=N1;x1++){
////            loop();
////        }
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of lines");
        int n = sc.nextInt();
        for (int i=1; i<=n+3; i++){
            for(int j=1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
            n=n-1;
        }
    }
}
