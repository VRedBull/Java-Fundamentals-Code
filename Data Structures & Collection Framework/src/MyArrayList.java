import java.util.*;

public class MyArrayList {
    public static void main(String[]args){
        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<String> nums = new ArrayList<>();

        fruits.add("Paneer");
        fruits.add("Paratha");
        fruits.add("Mojito");
        fruits.add(3,"Dahi");
        fruits.add(4,"Puri");
        fruits.add(5,"Chicken");

        nums.add("1");
        nums.add("2");
        nums.add("3");
        fruits.addAll(2,nums);
//        System.out.println(fruits);

//        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<String> gfg1 = new ArrayList<>(Arrays.asList("is","for","coding", "Geeks"));

        ArrayList<String> gfg = new ArrayList<String>() {
            {
                add("Geeks");
                add("for");
                add("Geeks");
                add("is");
                add("coding");
                add("website");
                add("for");
                add("students");
            }
        };
        gfg.toArray();

        // print Array
        System.out.println("ArrayList: " + gfg);



//        System.out.println(nums);
//        System.out.println("ArrayList elements using the get function:"+nums.get(0)+" "+nums.get(1));
    }
}
