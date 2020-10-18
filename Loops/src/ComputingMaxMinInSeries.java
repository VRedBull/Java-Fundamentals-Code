import javax.swing.*;
import java.util.*;
public class ComputingMaxMinInSeries {
    public static void main (String[]args){
        int  max,min,nData, input;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of data you wanna input=");
        nData=sc.nextInt();
        if(nData<=0){
            throw new IllegalArgumentException("data "+nData+" is invalid");
        }

        max=min=0;

         for(int round=1; round<=nData; round++){
             System.out.print("Enter your 1st data " );
             input = sc.nextInt();
             max=input;
             min=input;


                if(max<input){
                max=input;
                }
                if(min>input){
                min=input;
                }

            }
        System.out.print("Max no. is "+max+" Min no. is "+min);


    }
}
