import java.util.*;

public class MultidimensionalArrays {
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
//        int m;
//        System.out.print("Enter no. of Soldiers=");
//        int nOfSold = sc.nextInt();
//        int [] n = new int[nOfSold];
//        for(int l = n.length; l>0; l--) {
//            for (int i = 0; i < nOfSold; i++) {
//                n[i] = i;
//            }
//            System.out.print("Enter no. m=");
//            m = sc.nextInt();
//
//            for (int k = 0; k < n.length; k++) {
//                if (n[k] % m == 0) {
//                    for (int j = m - 1; j < m + 1; j++) {
//                        n[m] = n[m + 1];
//                    }
//                    n[n.length - 1] = 0;
//                    for(int o = 0; o<n.length; o++){
//                        System.out.print(n[o]+" ");
//                    }
//                }
//            }
//        }

        //2D Array

//        int [][] a = new int[4][3];
//        System.out.print(a[1][2]);

        //printing 2D arrays

//        int [][] b = {
//                {2,3,4,5},
//                {5,7,8,9,95,2},
//                {45,67,23,54}
//        };
//        for(int i = 0; i<b.length; i++){
//            for(int j = 0; j<b[i].length; j++){
//                System.out.print(b[i][j]+" ");
//            }
//            System.out.println();
//        }
//        System.out.println("2nd row 3rd column="+b[1][2]);


        //Addition of 2D arrays (as in addition of matrix)

//        int rows, col;
//        System.out.print("Enter rows and columns=");
//        rows = sc.nextInt();
//        col = sc.nextInt();
//
//        int [][] a = new int [rows][col];
//        int [][] b = new int [rows][col];
//
//        System.out.print("Enter array a elements=");
//        for(int i = 0; i<rows; i++){
//            for(int j = 0; j<col; j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
//
//        System.out.print("Enter array b elements=");
//        for(int i = 0; i<rows; i++){
//            for(int j = 0; j<col; j++){
//                b[i][j] = sc.nextInt();
//            }
//        }
//
//        System.out.print("Result array c elements=");
//        int [][] c = new int[rows][col];
//        for(int i = 0; i<rows; i++){
//            for(int j = 0; j<col; j++){
//                c[i][j] = a[i][j]+b[i][j];
//            }
//        }
//
//        for(int i = 0; i<rows; i++){
//            for(int j = 0; j<col; j++){
//                System.out.print(c[i][j]+" ");
//            }
//            System.out.println();
//        }

        //2D Array multiplication (as in Matrix multiplication)

//        System.out.print("Enter rows length=");   //It's going to be a square matrix
//        int rows = sc.nextInt();
//        System.out.print("Enter column length=");
//        int cols = sc.nextInt();
//        int [][] a = new int[rows][cols];
//        int [][] b = new int[rows][cols];
//
//        System.out.print("Enter elements of a matrix=");
//
//        for(int i =0; i<rows; i++){
//            for(int j = 0; j<cols; j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
//
//        System.out.print("Enter elements of b matrix=");
//        for(int i =0; i<rows; i++){
//            for(int j = 0; j<cols; j++){
//                b[i][j] = sc.nextInt();
//            }
//        }
//
//        int c[][] = new int[rows][cols];
//
//        for(int i = 0; i<rows; i++){
//            for(int j=0; j<cols; j++){
//                c[i][j]=0;
//                for(int k=0; k<rows; i++){
//                    c[i][j]+=a[i][k]*b[k][j];
//                }
//                System.out.print(c[i][j]+" ");
//            }
//            System.out.println();
//
//        }

        //Online solution

//        int a[][]={{1,1,1},{2,2,2},{3,3,3}};
//        int b[][]={{1,1,1},{2,2,2},{3,3,3}};
//
////creating another matrix to store the multiplication of two matrices
//        int c[][]=new int[3][3];  //3 rows and 3 columns
//
////multiplying and printing multiplication of 2 matrices
//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//                c[i][j]=0;
//                for(int k=0;k<3;k++)
//                {
//                    c[i][j]+=a[i][k]*b[k][j];
//                }//end of k loop
//                System.out.print(c[i][j]+" ");  //printing matrix element
//            }//end of j loop
//            System.out.println();//new line
//        }

        //3D array

//        int [][][] a = new int[4][4][4];    //we created a 3D array of 64 elements
//        for(int i =0; i<4; i++){
//            for(int j=0; j<4; j++){
//                for(int k=0; k<4; k++){
//                    System.out.print(a[i][j][k]+" ");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }

        //enhanced for Loop

        //int [] a = new int [5];
//        int a []={1,2,3,4,5};
//        for(int j : a){
//            System.out.print(j);
//        }

        //Jagged arrays

//        int [][] a = new int [3][];     //here we define only no.of Rows but leave no. of columns
//
//        a[0]= new int[3];       //here we define no. of columns for row 1
//        a[1]= new int[2];       //here we define no. of columns for row 2
//        a[2]= new int[4];       //here we define no. of columns for row 3




    }
}
