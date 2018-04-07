package check;

import java.io.File;


public class existence {
    public static void main(String[] args) {
         File file = new File("/Users/nacer-zimu/Desktop/test.doc");

         if (file.exists())
             System.out.println(file.getName()+ " exists!");
         else
             System.out.println("this file does not exist!");
    }

}
