import java.util.*;
public class ContinueAndBreak {
    public static void main(String[]args){
        for (int i=1; i<=11; i++){
            if(i%2==0){
                continue;
            }
            if(i>10){
                break;
            }
            System.out.println("Hello");
        }
    }
}
