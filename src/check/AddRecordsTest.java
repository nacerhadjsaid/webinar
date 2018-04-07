package check;

public class AddRecordsTest {
    public static void main(String[] args) {
        AddRecords aR = new AddRecords();
        aR.openFile();
        aR.addRecords();
        aR.closeFile();
    }
}
