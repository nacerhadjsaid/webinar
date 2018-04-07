package check;
import java.io.*;

public class Reader {
    public static void main(String[] args) {

        FileReader fr = null;
        BufferedReader br = null;

        //open file
        try {
            fr = new FileReader("test.txt");
        }catch (Exception e) {
            System.out.println("Error!");
        }
        //read file
        try{
            if (fr != null){
                br = new BufferedReader(fr);
                String str  = " ";
                while ((str = br.readLine()) !=null);{
                    System.out.println(str);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        //close file
        finally {
            if (fr != null){
                try {
                    br.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            if (br!= null){
                try {
                    br.close();
                }catch (Exception e){

                }
            }
        }
    }


}
