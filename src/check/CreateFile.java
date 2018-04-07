package check;
import java.util.*;

public class CreateFile {
    public static void main(String[] args) {
        final Formatter createFile;

        try{
            createFile= new Formatter("AirCraft.doc");
            System.out.println("your file is created!");
        } catch (Exception e){
            System.out.println("Error!");
        }

    }
}
