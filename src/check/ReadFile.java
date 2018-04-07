package check;
import java.io.*;
import java.util.*;

public class ReadFile {
    private Scanner sc;

    //open file
    public void openfile(){
        try {
            sc = new Scanner( new File("/Users/nacer-zimu/Desktop/test"));
        }catch (Exception e){
            System.out.println("Error!");
        }
    }
    //read inside a file
    public void readFile(){
        while (sc.hasNext()){
            String a = sc.next();
            String b = sc.next();
            System.out.printf("%s %s\n",a,b);
        }
    }
    //close file
    public void closeFile(){
        sc.close();
    }
}
