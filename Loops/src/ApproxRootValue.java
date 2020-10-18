import java.util.*;
public class ApproxRootValue {
    public static final double SMALL=0.0000000000001;
    public static void main(String[]args){
        double high,low,root,square,diff,original;
        int round=0;
        original=0;
        high=original+0.5;
        low=0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter the value you wanna find root of=");
            root = sc.nextDouble();
            square=root*root;
            diff=original-square;
            if(diff==0){
                break;
            }else if(diff>0){
                low=root;
            }else if(diff<0){
                high=root;
            }
            round++;
        }while( diff >= SMALL || diff <= -SMALL);
    }


}
