package check;

public class ReadFileTest {
    public static void main(String[] args) {
        ReadFile rf = new ReadFile();
        rf.openfile();
        rf.readFile();
        rf.closeFile();
    }
}
