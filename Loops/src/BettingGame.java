import java.util.*;
public class BettingGame {
    public static void main(String[]args){
        int possession,betType,betAmount,number;
        Scanner sc=new Scanner(System.in);
        possession=10*10000;
        for(int i=1; i<=10; i++){
        System.out.println("You are in round "+i);
        System.out.println("You have "+possession+" coins");
        System.out.print("Enter amount of coins you wanna bet=");
        betAmount=sc.nextInt();
        if(betAmount<1){
            betAmount=1;
        }
        else if(betAmount>possession){
            betAmount=possession;
        }
        System.out.println("Your bet amount is="+betAmount);
        System.out.print("Enter type of bet you wanna place -1 for odd, 0 for even OR 1 to 6 for exact number=");
        betType=sc.nextInt();
        number=1+(int)(6*Math.random());
        if (betType==-1 && number%2==1 || betType==0 && number%2==0){
            System.out.println("You won");
            possession+=betAmount;
        }
        else if(betType==number){
            System.out.println("You won Big Time");
            possession+=betAmount*5;
        }

        else{
            System.out.println("you have lost");
            possession-=betAmount;
            if(possession==0){
                break;
            }
        }
        System.out.println("The Exact number was="+number);

        }
        System.out.println("you ended up with "+possession+" coins");

    }
}
