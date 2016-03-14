package handlers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreateDataStructureTest {
    @Test
    public void test_split_line_should_split_the_lines_with_new_line_character() throws Exception {
        String guestRecords = "Maria,Sharapova,Female,29,Moscow,Georgia,Russia\nJohny,Depp,Male,45,West Shanna,Washington,America";
        CreateDataStructure dataStructure = new CreateDataStructure(guestRecords);
        assertEquals(2, dataStructure.getList().size());
    }
}