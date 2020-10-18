import java.util.*;
import java.io.*;

public class FileHandling {
    public static void main(String... args){
//        File f1 = new File("C:/Users/Vikas/IdeaProjects\\Arrays and objects\\src");
//        File[] x = f1.listFiles();

        Scanner sc = new Scanner(System.in);

        //A Demonstration of Try-Catch
//        String a, b;
//        System.out.print("Enter the 1st file path=");
//        a = sc.nextLine();
//        System.out.print("Enter the 2nd file path=");
//        b = sc.nextLine();
//
//        try {
//            File f = new File(a);
//            File g = new File(b);
//            creationPlay(f, g);
//            System.out.println("Operations completed without errors");
//
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("---Program terminated ---");
//        }
//
//
//    }
//
//    public static void showExistance(File f, File g) {
//        boolean x = f.exists();
//        boolean y = g.exists();
//        System.out.printf("%s=%s, %s=%s%n", f, x, g, y);
//    }
//
//    public static void creationPlay(File f, File g) throws IOException {
//
//        System.out.print(" " + f.getCanonicalPath());
//        System.out.print(" " + g.getCanonicalPath());
//
//        showExistance(f, g);
//
//        boolean x2 = f.createNewFile();
//        boolean y2 = g.createNewFile();
//
//        showExistance(f, g);
//
//        boolean x3 = f.renameTo(f);
//
//        showExistance(f, g);
//
//        boolean x4 = f.renameTo(f);
//        boolean y4 = g.renameTo(g);
//
//        showExistance(f,g);
//
//        boolean x5 = f.mkdir();
//        boolean y5 = g.mkdir();
//
//        showExistance(f,g);
//
//        boolean x6 = f.mkdir();
//        boolean y6 = g.mkdir();
//        showExistance(f,g);
//
//    }

        //File Listing





//    public static void directoryPlay(File home){
//        File parent = home.getParentFile();
//        File [] list = parent.listFiles();
//        boolean flags [][] = new boolean[list.length][5];
//        for(int i = 0; i<list.length; i++){
//
//                long sizes;
//                String name;
//                sizes = list[i].length();
//                flags[i][0] = list[i].canExecute();
//                flags[i][1] = list[i].canRead();
//                flags[i][2] = list[i].canWrite();
//                flags[i][3] = list[i].isDirectory();
//                flags[i][4] = list[i].isFile();
//
//
//
//
//        }

        //finally block in try and catch

//        try{
//            int []a = new int[3];
//            a[4] = 34;
//            int i=10,j=2;
//            int x = i/j;
//            System.out.println(x);
//        }catch( ArithmeticException e){
//
//            System.err.println("ERROR!!!");   //We can type err instead of out to get red color
//        }
//        catch( Exception e){        //You cannot put this catch before ArithmeticException, since this ArithmeticException is a descendant of this Exception
//            System.out.println(e);      //This way you can view which type of exception has occurred
//        }
//        finally{
//            System.out.println("BYE!!!");
//        }

//        //Creating a File
//        try{
//            File f = new File("C:\\Softwares\\NEWfile.txt");    //Creates a new file of name NEWfile.txt
//            if(f.createNewFile()){      //IF it's created then...
//                System.out.print("Created = "+f.getName());     //prints the name of the file which is NEWfile.txt
//
//            }else{
//                System.out.print("It already exists");      //If executing the code 2nd time or file already exists
//            }
//        }catch(IOException e){
//            System.out.println("ERROR!!!");
//            e.printStackTrace();
//        }

        //File Information

//        File f = new File("C:\\Softwares\\NEWfile.txt");
//        if(f.exists()){
//            System.out.println("File name:"+f.getName());
//            System.out.println("Absolute Path:"+f.getAbsolutePath());
//            System.out.println("Writable:"+f.canWrite());
//            System.out.println("Readable:"+f.canRead());
//            System.out.println("File size in bytes:"+f.length());
//        }else{
//            System.out.print("The File doesn't exist");
//        }


        //Writing to Files

//        try{
//            FileWriter writeThis = new FileWriter("C:\\Softwares\\NEWfile.txt");
//            writeThis.write("01234567891");
//            writeThis.close();
//            System.out.println("YES!!!");
//            File abc = new File("C:\\Softwares\\NEWfile.txt");
//            System.out.println(abc.length());   //Outputs the size file
//
//        }catch( IOException e ){
//            System.out.println(e);
//        }

        //Reading From Files

//        try {
//            File f = new File("C:\\Softwares\\NEWfile.txt");
//            Scanner reader = new Scanner(f);
//            while(reader.hasNextInt()){
//                String x = reader.nextLine();
//                System.out.print(x);
//            }
//        }catch(Exception e ){
//            e.printStackTrace();
//        }

    }

}

