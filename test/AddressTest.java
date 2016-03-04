import org.junit.Test;

import static org.junit.Assert.*;

public class AddressTest {
    Address address = new Address("Chennai", "TamilNadu", "India");

    @Test
    public void test_getCountry_gives_country() throws Exception {
        assertEquals("India",address.getCountry());
    }

    @Test
    public void test_getState_gives_state() throws Exception {
        assertEquals("TamilNadu",address.getState());
    }

    @Test
    public void test_getCity_gives_city() throws Exception {
        assertEquals("Chennai",address.getCity());
    }
}