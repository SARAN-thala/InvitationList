package personDetails;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddressTest {
    @Test
    public void test_to_string() throws Exception {
        Address address = new Address("Chennai", "TamilNadu", "India");
        assertEquals("Chennai, TamilNadu\nIndia", address.getFullAddress());
    }
}
