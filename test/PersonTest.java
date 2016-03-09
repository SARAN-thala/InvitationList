import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    private Name name;
    private Address address;
    private Gender gender;
    private Person person;

    @Before
    public void setUp() throws Exception {
        name = new Name("Ajith", "Kumar");
        address = new Address("Chennai", "TamilNadu", "India");
        gender = Gender.Male;
        person = new Person(name, gender, 40, address);
    }

    @Test
    public void test_get_informal_name_with_title() throws Exception {
        String expected = "Mr Ajith Kumar";
        assertEquals(expected, person.getNameWithTitle(true));
    }

    @Test
    public void test_get_formal_name_with_title() throws Exception {
        String expected = "Mr Kumar, Ajith";
        assertEquals(expected, person.getNameWithTitle(false));
    }

    @Test
    public void test_get_informal_name_with_country() throws Exception {
        String expected = "Mr Ajith Kumar, India";
        assertEquals(expected, person.getNameWithCountry());
    }

    @Test
    public void test_get_formal_name_with_country() throws Exception {
        String expected = "Mr Kumar, Ajith, India";
        assertEquals(expected, person.getNameWithCountry(false));
    }

    @Test
    public void test_get_formal_name_with_full_address() throws Exception {
        String expected = "Mr Kumar, Ajith, Chennai, TamilNadu, India";
        assertEquals(expected, person.getAddress(false));
    }

    @Test
    public void test_get_informal_name_with_full_address() throws Exception {
        String expected = "Mr Ajith Kumar, Chennai, TamilNadu, India";
        assertEquals(expected, person.getAddress());
    }
}