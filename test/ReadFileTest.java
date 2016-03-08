import org.junit.Test;

import static org.junit.Assert.*;

public class ReadFileTest {
    @Test
    public void test_read_file_it_can_read_a_given_csv_file() throws Exception {
        ReadFile readFile = new ReadFile("./data/sample.csv");
        assertEquals("Saran,Raj,Male,23,Chennai,TamilNadu,India",readFile.getList().get(0));
    }
}