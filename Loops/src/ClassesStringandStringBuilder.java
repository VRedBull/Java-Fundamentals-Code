import java.util.*;
public class ClassesStringandStringBuilder {
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter your String=");
    String st=sc.nextLine();
    int n=st.length();
    for(int i=0; i<=n-1; i++) {
        System.out.println("Character at=" + i + " is\"" + st.charAt(i) + "\"");
    }
    

    }

}
