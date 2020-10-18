import java.util.*;
 public class KeyInputs {

     public static void main(String[]args){
     Scanner key=new Scanner(System.in);

     System.out.print("Enter your num1=");
    double num1=key.nextInt();
         System.out.print("Enter your num2=");
    double num2=key.nextInt();

    System.out.println("What you wanna do?");
    key.nextLine();
         String op=key.nextLine();
         double result=0;
    switch (op){
        case "*":
            result=num1*num2;
            break;
        case"+":
            result=num1+num2;
break;
        case  "/":
            result=num1/num2;
            break;
        case "-":
            result=num1-num2;
            break;
        default:
            System.out.print("out of scope");
         }
System.out.print("result is = "+result);

    }



     }


