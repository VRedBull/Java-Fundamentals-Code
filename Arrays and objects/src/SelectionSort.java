import java.util.Scanner;

public class SelectionSort {
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);

        //Selection Sort

//        int [] a = {2,5,1,6,-1,0,3,6,8,-4,-1,23,765,-7,34,0,23};
//        int n = a.length;
//
//        for( int i = 0; i<n; i++){
//            int minInd=i;
//            for(int j=0; j<n; j++){
//                if( a[j]>a[minInd]){
//                    int temp = a[j];
//                    a[j] = a[minInd];
//                    a[minInd] = temp;
//                }
//            }
//        }
//        for( int e : a){
//            System.out.print(e+" ");
//        }

        //2nd Method

//        int [] a = {2,5,1,6,-1,0,3,6,8,-4,-1,23,765,-7,34,0,23};
//        int n = a.length;
//
//        for(int i = 0; i<n; i++){
//            int minInd = i;
//            for(int j = i; j<n; j++){
//                if(a[j]<a[minInd]){
//                    minInd = j;
//                }
//            }
//            int temp = a[i];
//            a[i] = a[minInd];	//Here If the value minInd = j then only this will work otherwise i=j
//            a[minInd] = temp;
//        }
//
//        for(int e: a){
//            System.out.print(e+" ");
//        }

        //

    }
}
