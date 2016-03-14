package personDetails;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;

public class PersonTest {

    private Person malePerson;
    private Person femalePerson;

    @Before
    public void setUp() throws Exception {
        Name maleName = new Name("Ajith", "Kumar");
        Name femaleName = new Name("Jessica", "Alba");
        Address mAddress = new Address("Chennai", "TamilNadu", "India");
        Address fAddress = new Address("Las Vegas", "New York", "America");
        Gender male = Gender.Male;
        Gender female = Gender.Female;
        malePerson = new Person(maleName, male, 40, mAddress);
        femalePerson = new Person(femaleName, female, 18, fAddress);
    }

    @Test
    public void test_get_informal_name_with_title() throws Exception {
        String expectedMale = "Mr Ajith Kumar";
        assertEquals(expectedMale, malePerson.getNameWithTitle(true));
        String expectedFemale = "Ms Jessica Alba";
        assertEquals(expectedFemale, femalePerson.getNameWithTitle(true));
    }

    @Test
    public void test_get_formal_name_with_title() throws Exception {
        String expectedMale = "Mr Kumar, Ajith";
        assertEquals(expectedMale, malePerson.getNameWithTitle(false));
        String expectedFemale = "Ms Alba, Jessica";
        assertEquals(expectedFemale, femalePerson.getNameWithTitle(false));
    }

    @Test
    public void test_get_informal_name_with_country() throws Exception {
        String expected = "Mr Ajith Kumar, India";
        assertEquals(expected, malePerson.getNameWithCountry());
        String expect = "Ms Jessica Alba, America";
        assertEquals(expect, femalePerson.getNameWithCountry());
    }

    @Test
    public void test_get_formal_name_with_country() throws Exception {
        String expected = "Mr Kumar, Ajith, India";
        assertEquals(expected, malePerson.getNameWithCountry(false));
        String expect= "Ms Alba, Jessica, America";
        assertEquals(expect, femalePerson.getNameWithCountry(false));
    }

    @Test
    public void test_get_formal_name_with_full_address() throws Exception {
        String expected = "Mr Kumar, Ajith, Chennai, TamilNadu, India";
        assertEquals(expected, malePerson.getAddress(false));
        String expect = "Ms Alba, Jessica, Las Vegas, New York, America";
        assertEquals(expect, femalePerson.getAddress(false));
    }

    @Test
    public void test_get_informal_name_with_full_address() throws Exception {
        String expected = "Mr Ajith Kumar, Chennai, TamilNadu, India";
        assertEquals(expected, malePerson.getAddress());
        String expect = "Ms Jessica Alba, Las Vegas, New York, America";
        assertEquals(expect, femalePerson.getAddress());
    }

    @Test
    public void test_get_informal_name_with_address_in_command_line() throws Exception {
        String expected = "Mr Ajith Kumar, India";
        assertEquals(expected, malePerson.withAddressAndStyle("-f", "India"));
        assertFalse(Boolean.parseBoolean(malePerson.withAddressAndStyle("-f", "Iran")));
    }

    @Test
    public void test_get_informal_name_with_country_and_age_in_command_line() throws Exception {
        String expected = "Mr Ajith Kumar, India, 40";
        assertEquals(expected, malePerson.withAddressAndAge("-f", "India", "24"));
        assertFalse(Boolean.parseBoolean(malePerson.withAddressAndAge("-f", "India","42")));
    }
}