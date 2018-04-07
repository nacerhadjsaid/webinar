package check;
import java.lang.*;
import java.util.*;
import java.io.*;

public class AddRecords {
    private Formatter createFile;

    //open file
    public  void openFile(){
        try {
            createFile = new Formatter("test.txt");
        }catch (Exception e){
            System.out.println("Error!");
        }
    }
    //add records
    public void addRecords(){
        createFile.format("%s %s %s", "100","Jack","Sparrow");
    }
    //close file
    public void closeFile(){
        createFile.close();
    }
}
