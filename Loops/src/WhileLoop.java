import java.util.*;
public class WhileLoop {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your String=");
//        String token = sc.nextLine();
//
//        while(sc.hasNext()){
//            String atoken = sc.next();
//            System.out.print(atoken);
//        }

        //Summing Input numbers

//        int  goal, in, sum;
//        goal = 1000;
//
//        sum = 0;
//        while(sum<goal){
//            System.out.print("Enter your Number=");
//            in = sc.nextInt();
//            sum = sum+in;
//            if(sum>goal) {
//                sum=goal;
//                System.out.println("your Sum is=" + sum);
//            }else{
//                System.out.println("your Sum is=" + sum);
//            }
        //Integer Overflow
//        int number;
//        System.out.print("Enter a value");
//        number = sc.nextInt();
//        while(number>0){
//            System.out.println("Your number is="+number);
//            number=number*2;
//        }
//        System.out.println("Your number is1="+number);

        //Vending Machine

//        int total,target,n;
//        target=175;
//        total=0;
//        int x;
//        x=0;
//        while(total<=target){
//            System.out.print("Enter N for nickel D for Dime Q for quater=");
//            String inType= sc.nextLine();
//            int inc;
//            switch(inType.charAt(0)){
//                case 'N':inc=5;break;
//                case 'D':inc=10;break;
//                case 'Q':inc=25;break;
//                default:inc=0;
//            }
//            System.out.print("How many coins you wanna put of these type?=");
//            n=sc.nextInt();
//            total=total+n*inc;
//
//            System.out.println("Your total is="+total);
//            if(total>target){
//                x=total-target;
//
//                System.out.println("The total has exceeded the target by="+x);
//            }
//        }

        //Collatz Conjecture

//        int numberIn=1;
//        while(numberIn>=1) {
//            System.out.print("Enter your number=");
//            numberIn = sc.nextInt();
//            if (numberIn > 0) {
//                test(numberIn);
//            }
//        }
//        System.out.print("....quitting");
//    }
//
//    public static int update(int num){
//        if (num % 2 == 0) {
//                return num / 2;
//            }
//        return num * 3 + 1;
//    }
//
//    public static void test(int numberIn){
//        int round=0;
//        while(numberIn>1){
//            numberIn=update(numberIn);
//            round++;
//            System.out.printf("Your updated number is %d and round is %d%n", numberIn, round);
//        }

        // Collatz Conjecture MY method

//        int input,x,y;
//        input=1;
//        while(input>0){
//            System.out.print("Enter your number=");
//            input=sc.nextInt();
//                while(input>1){
//                    if(input%2==0){
//                        x=input/2;
//                        System.out.println("Your updated number is = "+x);
//                        input=x;
//                    }else{
//                        y=input*3+1;
//                        System.out.println("Your updated number is = "+y);
//                        input=y;
//                    }
//                }
//                if(input<1){
//                    System.out.print("...Quitting");
//                }
//        }

        // Covnerting Decimal Numbers to Binary Numbers

//        int number;
//        String result;
//        number=0;
//        while(number>=0)
//        {
//            System.out.print("Enter your decimal number=");
//            number = sc.nextInt();
//            result = convert(number);
//            System.out.printf("Your decimal no.=%d, the Binary Conversion=%s%n",number, result);
//        }
//    }
//    public static String convert(int number){
//    if(number==0){
//        return "0";
//    }
//    int bit;
//    String binary;
//    binary=" ";
//    while(number>0){
//        bit=number%2;
//        binary=(" "+bit);
//        number=number/2;
//    }
//    return binary;

        //Alternate Decimal to Binary Method

//        int n;
//        n=1;
//        while(n>0)
//        {
//            System.out.print("Enter your number=");
//            n = sc.nextInt();
//            StringBuffer s = new StringBuffer();
//            while (n > 0) {
//                s.append(n % 2);
//                n = n / 2;
//            }
//            System.out.println("Your decimal number is=" + s.reverse());
//            n++;
//        }

        //Simple While Loop

//        int i=0;
//        while(i<=10){
//            System.out.println(i);
//            i++;
//        }

        //Conversion Decimal to binary

//        int n=5;
//        StringBuffer binary = new StringBuffer();
//        while(n>0){
//            int x = n%2;
//            binary.append(x);
//            n=n/2;
//        }
//        System.out.print("Banry="+binary.reverse());

        //CTRL-D

//        int total=0,count=0,input;
//        System.out.print("Enter inputs. End with CTRL-D=");
//        while(sc.hasNext()){
//            input = sc.nextInt();
//            total+=input;
//            count++;
//        }
//        System.out.printf("%4d is Total and you entered %d times.",total,count);

        //Adding digits in a number

//        String n = "123";
//        int x=0,b=0;
//
//        while(x<=n.length()){
//            int a=n.charAt(x);
//            b=b+a;
//            x++;
//
//        }
//        System.out.println("Sum of your digits="+b);

        //Method 2 for adding the digits

//        System.out.print("Enter your number=");
//        int n=sc.nextInt();
//        int x=0;
//
//        System.out.println("Number of digits = "+(int)(Math.log10(n)+1));
//
//        while(n>0){
//
//            int y=n/10;
//            int z=n%10;
//            x=x+z;
//            n=y;
//        }
//        System.out.print("digits sum="+x);

        //Palindrome Number

        System.out.print("Enter a palindrome number=");
        int n=sc.nextInt();
        int x=0;
        double y=(int)(Math.log10(n)+1)-1;
        while(n>0){
            int a = n/10;
            int b = n%10;
            x += b * Math.pow(10, y);
            n=a;
            y--;
        }
        System.out.println("The reverse of the number is="+x);


    }
}
