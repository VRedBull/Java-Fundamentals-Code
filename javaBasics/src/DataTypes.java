import java.util.*;
public class DataTypes{
public static void response(String data){
    System.out.println("My name is "+data+".");
}
public static void response(int data){
    System.out.println("My age is"+data+".");

}
public static void response(int data1, double data2){
    System.out.println("My height is "+data1+" feet and "+data2+"inches");
}
public static void main (String[]args){
    Scanner a=new Scanner(System.in);
    System.out.print("Enter your name=");
    String name=a.nextLine();
    System.out.print("Enter your age=");
    int age=a.nextInt();
    System.out.print("Enter your height in feet=");
    int feet=a.nextInt();
    System.out.print("Enter your height in inches=");
    double inches=a.nextDouble();
    response(name);
    response(age);
    response(feet, inches);

}
}





