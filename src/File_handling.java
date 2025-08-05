import java.io.File; //import the file class library
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_handling {
    public static void main(String[] args) {

        // New file object creation

        //filepath - where to save file - "C:\\Users\\MyName\\filename.txt"

        //creating file
//        try{
//            File myObj = new File("myfile.txt");
//            if(myObj.createNewFile()){
//                System.out.println("File created: "+myObj.getName());
//            }else{
//                System.out.println("File Alredy exists");
//            }
//        }catch(IOException e){
//            System.out.println("Error occured : "+e);
//            e.printStackTrace();
//        }

        //writing file
//        try{
//            //writing a file content
//            FileWriter fw = new FileWriter("myfile.txt");
//            fw.write("File in Java . Adding financial text super easy");
//            fw.append("Hello");
//            fw.close();
//            System.out.println("Successfully written to file");
//        }catch(IOException e){
//            System.out.println(e);
//            e.printStackTrace();
//        }

        //reading file
//        try{
//            File myObj = new File("myfile.txt");
//            Scanner myReader = new Scanner(myObj);
//            while (myReader.hasNextLine()){
//                String data = myReader.nextLine();
//                System.out.println(data);
//            }
//            myReader.close();
//        }catch (FileNotFoundException e){
//            System.out.println("Error raised ");
//            e.printStackTrace();
//        }

        //file information
//        File myObj = new File("myfile.txt");
//        if(myObj.exists()){
//            System.out.println("File name: "+myObj.getName());
//            System.out.println("Absolute path "+myObj.getAbsolutePath());
//            System.out.println("Writable or not - "+myObj.canWrite());
//            System.out.println("Readable or not - "+myObj.canRead());
//            System.out.println("File size - "+myObj.length());
//        }else {
//            System.out.println("File not found..");
//        }

        //delete a file
//        File myObj = new File("myfile.txt");
//        if(myObj.delete()){
//            System.out.println("File deleted Successfully "+myObj.getName());
//        }else{
//            System.out.println("File not found ");
//        }

        //delete directory
        File myObj = new File("D:\\newSampledir"); //enter path of directory
        if(myObj.delete()){
            System.out.println("Directory deleted "+myObj.getName());
        }else{
            System.out.println("dir not found ");
        }

    }
}
