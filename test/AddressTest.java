import org.junit.Test;

import static org.junit.Assert.*;

public class AddressTest {
    @Test
    public void test_get_city() throws Exception {
        Address address = new Address("Chennai", "TamilNadu", "India");
        assertEquals("Chennai",address.getCity());
    }

    @Test
    public void test_get_state() throws Exception {
        Address address = new Address("Chennai", "TamilNadu", "India");
        assertEquals("TamilNadu",address.getState());
    }

    @Test
    public void test_get_country() throws Exception {
        Address address = new Address("Chennai", "TamilNadu", "India");
        assertEquals("India",address.getCountry());
    }

    @Test
    public void test_to_string() throws Exception {
        Address address = new Address("Chennai", "TamilNadu", "India");
        assertEquals("Chennai, TamilNadu, India",address.toString());
    }
}