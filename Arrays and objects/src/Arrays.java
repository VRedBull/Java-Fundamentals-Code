import java.util.*;
public class Arrays {
    public static void main(String[]args){

        //Introduction

//        int [] myInt=new int[10];
//        String [] myStr = new String[19];
//        System.out.println(myInt.length);
//        System.out.println(myStr.length);

        Scanner sc = new Scanner(System.in);
//        double [] marks = {3.1, 4.7, 9.3};
//        marks[1]=2.4;
////        System.out.print(marks[1]);
//        for (int i =0; i<marks.length; i++){
//            System.out.println(marks[i]);
//        }

//        int [] counts = new int[11];
//        System.out.println("Enter scores in the range 0...100.");
//        System.out.println("When you are done, enter CTRL-d");
//
//        while(sc.hasNext()){
//            int score = sc.nextInt();
//            int pos = score/10;
//            counts[pos]++;
//        }
//        System.out.println("Histogram:");
//        for (int index = 0;index<=10; index++){
//            System.out.printf("%3d:%d%n", index*10, counts[index]);
//        }
//        System.out.println("The bar histogram:");
//        for (int index = 0; index<=10; index++){
//            System.out.printf("%3d:",index*10);
//            for (int i =1; i<=10; index++){
//                System.out.print("#");
//            }
//            System.out.println();
//        }

//        int pos;
//        int rounds=sc.nextInt();
//        double [] rates = new double[13];
//        for (int i=0; i<=rounds; i++){
//
//            pos = (int)(Math.random()*6)+(int)(Math.random()*6)+2;
//            rates[pos]++;
//
//        }
//        System.out.print(rates);

        //Marks input

//        System.out.print("Enter how many students you have=");
//        int n = sc.nextInt();
//        int [] marks = new int[n];
//        int total=0;
//        for(int i=0; i<marks.length; i++){
//            System.out.print("Enter marks of your Student=");
//            marks[i]=sc.nextInt();
//            total+=marks[i];
//        }
//        double x=total/n;
//        System.out.println("Average="+x);

        //Throwing two dice

//        System.out.print("Enter how many throws=");
//        int n = sc.nextInt();
//        double []dice = new double[n];
//
//        for (int i=0; i<dice.length; i++){
//            int x = (int)(Math.random()*6)+(int)(Math.random()*6)+2;
//            dice[i]=x;
//        }
//        for (int j=2; j<=12; j++){
//            dice[j]=dice[j]*100/n;
//            System.out.printf( "%2d:%6.2f%%%n", j , dice[ j ] );
//        }
//        for(int j=2;j<=12;j++){
//            System.out.printf( "%2d:%6.2f%%%n", j , dice[ j ] );
//
//        }

        //Counting the Occurrences of Characters

//        String str = "Hello";
//        char[] c = str.toCharArray();
//        int i=0,j=0,counter=0;
//        for(i=0; i<str.length(); i++){
//
//            counter=0;
//            for(j=0; j<str.length(); j++){
//                if(c[j]==c[i]){
//                    counter++;
//                    continue;
//                }
//                System.out.println("The character "+c[i]+" present "+counter+" many times.");
////                continue;
//            }
//        }

        //Prime Finding
//
//        System.out.print("Enter Limit=");
//        int limit = sc.nextInt();
//        int [] prime = new int[limit];
//
//        for(int i = 0; i<=limit; i++){
//            if(i==0 || i==1){
//                continue;
//            }
//            for(int j=2; j<i; j++){
//                if(j%i==0){
//                    continue;
//                }
//                if(j%i != 0){
//                    prime[i] = j;
//                    System.out.println(prime[i]);
//                    break;
//                }
//            }
//        }

//        System.out.println("TempClassFile.main");
//        findPrimeNumbers(10);
//    }
//
//    public static void findPrimeNumbers(int limit) {
//        List<Integer> primeNumbers = new ArrayList<Integer>();
//        for (int i = 1; i <= limit; i++) {
//            int counter = 0;
//            for (int j = i; j >= 1; j--) {
//                if(i%j == 0) {
//                    counter++;
//                }
//            }
//            if(counter == 2) {
//                primeNumbers.add(i);
//            }
//        }
//        System.out.println("prime numbers are ::");
//        for(Integer primeNum : primeNumbers){
//            System.out.print(primeNum+" ,");
//        }


        

    }

    public static void fill(int[] ar, int i) {
    }
}
