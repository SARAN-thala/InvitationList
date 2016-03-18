package handlers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestListTest {
    @Test
    public void test_get_list_will_give_list_of_guests() throws Exception {
        String guestRecords = "Maria,Sharapova,Female,29,Moscow,Georgia,Russia\nJohny,Depp,Male,45,West Shanna,Washington,America";
        GuestList dataStructure = new GuestList(guestRecords);
        assertEquals(2, dataStructure.getList().size());
    }
}