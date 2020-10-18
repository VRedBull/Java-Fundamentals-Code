import java.util.*;
public class DesignObjClasses {
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);

        //The position of game piece

        int xPos, yPos;

        System.out.print("Enter the initial positions=");
        xPos = sc.nextInt();
        yPos = sc.nextInt();

        String answer;
        do{
            System.out.printf("Present pos. of the piece %d, %d%n",xPos,yPos);
            System.out.print("Enter the new positions=");
            int newXPos = sc.nextInt();
            int newYPos = sc.nextInt();
            xPos += newXPos;
            yPos += newYPos;
            System.out.printf("You new piece pos. is %d, %d%n",xPos,yPos);
            sc.nextLine();
            System.out.print("Enter Yes or No for continuation/termination = ");
            answer = sc.nextLine();
            answer.toLowerCase();
        }while(answer.startsWith("y"));
    }
}
