package handlers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReadFileTest {
    @Test
    public void test_for_readfile_will_give_the_stringified_file() throws Exception {
        ReadFile readFile = new ReadFile("./data/sample.csv");
        assertEquals(readFile.fileContent(),"Saran,Raj,Male,23,Chennai,TamilNadu,India");
    }
}