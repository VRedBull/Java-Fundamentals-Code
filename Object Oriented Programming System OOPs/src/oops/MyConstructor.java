package oops;

public class MyConstructor {
//    MyConstructor(){    //Name of the Constructor should always be equal to name of the class
//        System.out.println("Constructor is created.");
//    }
    public static void main(String...args){

       // MyConstructor obj = new MyConstructor();    //This is a bit like calling the Constructor

        Vehicle car = new Vehicle(4);
        Vehicle scooty = new Vehicle(2, "red");
        System.out.println("Car wheels = "+car.wheels);
        System.out.println("scooty wheels = "+scooty.wheels+" and color is "+scooty.color);

        Vehicle random = new Vehicle();
        System.out.print("random wheels="+random.wheels);
    }
}

class Vehicle{
    int wheels;
    String color;
    Vehicle(int wheels){
        this.wheels = wheels;
    }
    Vehicle(int wheels, String color){
        this.wheels = wheels;
        this.color = color;
    }
    Vehicle(){
        //null constructor with default values for all properties
    }
}
