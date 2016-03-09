import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddressTest {

    private Address address;

    @Before
    public void setUp() throws Exception {
        address = new Address("Chennai", "TamilNadu", "India");
    }

    @Test
    public void test_get_city() throws Exception {
        assertEquals("Chennai",address.getCity());
    }

    @Test
    public void test_get_state() throws Exception {
        assertEquals("TamilNadu",address.getState());
    }

    @Test
    public void test_get_country() throws Exception {
        assertEquals("India",address.getCountry());
    }

    @Test
    public void test_to_string() throws Exception {
        assertEquals("Chennai, TamilNadu, India",address.toString());
    }
}