import java.util.*;
public class UsingMultipleArrays {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        //Using multiple arrays
        int num;
        System.out.print("Enter number of people=");
        num = sc.nextInt();
        String [] names = new String[num];
        double [] scores = new double[num];
        boolean [] flag = new boolean[num];

        for(int i = 0; i<num; i++){
            System.out.printf("Enter name %d=",i);
            sc.nextLine();
            names[i]=sc.nextLine();
            System.out.printf("score of the person %d=",i);
            scores[i]=sc.nextDouble();
        }
        String ans;
        do
        {
            double upper, lower;
            System.out.print("Enter the lower and upper limits=");
            lower = sc.nextDouble();
            upper = sc.nextDouble();


            for (int j = 0; j < num; j++) {
                if (scores[j] >= lower && scores[j] < upper) {
                    System.out.printf("Name = %s, Score = %f%n", names[j], scores[j]);
                }
            }
            System.out.print("Continue(y/n)");
            ans = sc.next();

        }while(ans.startsWith("y"));

    }
}
