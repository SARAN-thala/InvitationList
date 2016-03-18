package personDetails;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PersonTest {

    private Person personAjith;
    private Person personJessica;

    @Before
    public void setUp() throws Exception {
        Name ajith = new Name("Ajith", "Kumar");
        Name jessica = new Name("Jessica", "Alba");
        Address ajithAddress = new Address("Chennai", "TamilNadu", "India");
        Address jessicaAddres = new Address("Las Vegas", "New York", "America");
        Age ajithAge = new Age(40);
        Age jessicaAge = new Age(18);
        Gender male = Gender.Male;
        Gender female = Gender.Female;
        personAjith = new Person(ajith, male, ajithAge, ajithAddress);
        personJessica = new Person(jessica, female, jessicaAge, jessicaAddres);
    }

    @Test
    public void test_get_informal_name_with_title() throws Exception {
        String expectedMale = "Mr Ajith Kumar";
        assertEquals(expectedMale, personAjith.getInformalName());
        String expectedFemale = "Ms Jessica Alba";
        assertEquals(expectedFemale, personJessica.getInformalName());
    }

    @Test
    public void test_get_formal_name_with_title() throws Exception {
        String expectedMale = "Mr Kumar, Ajith";
        assertEquals(expectedMale, personAjith.getFormalName());
        String expectedFemale = "Ms Alba, Jessica";
        assertEquals(expectedFemale, personJessica.getFormalName());
    }

    @Test
    public void test_get_informal_name_with_country() throws Exception {
        String expected = "Mr Ajith Kumar, India";
        assertEquals(expected, personAjith.getInformalNameWithCountry());
        String expect = "Ms Jessica Alba, America";
        assertEquals(expect, personJessica.getInformalNameWithCountry());
    }

    @Test
    public void test_get_formal_name_with_country() throws Exception {
        String expected = "Mr Kumar, Ajith, India";
        assertEquals(expected, personAjith.getFormalNameWithCountry());
        String expect= "Ms Alba, Jessica, America";
        assertEquals(expect, personJessica.getFormalNameWithCountry());
    }

    @Test
    public void test_get_formal_name_with_full_address() throws Exception {
        String expected = "Mr Kumar, Ajith\nChennai, TamilNadu\nIndia";
        assertEquals(expected, personAjith.getFormalNameWithAddress());
        String expect = "Ms Alba, Jessica\nLas Vegas, New York\nAmerica";
        assertEquals(expect, personJessica.getFormalNameWithAddress());
    }

    @Test
    public void test_get_informal_name_with_full_address() throws Exception {
        String expected = "Mr Ajith Kumar\nChennai, TamilNadu\nIndia";
        assertEquals(expected, personAjith.getInformalNameWithAddress());
        String expect = "Ms Jessica Alba\nLas Vegas, New York\nAmerica";
        assertEquals(expect, personJessica.getInformalNameWithAddress());
    }

    @Test
    public void test_get_informal_name_with_address_in_command_line() throws Exception {
        String expected = "Mr Ajith Kumar, India";
        assertEquals(expected, personAjith.withNameAndCountry("-f", "India"));
        assertEquals("", personAjith.withNameAndCountry("-f", "Iran"));
    }

    @Test
    public void test_get_informal_name_with_country_and_age_in_command_line() throws Exception {
        String expected = "Mr Ajith Kumar, India, 40";
        assertEquals(expected, personAjith.withAddressAndAge("-f", "India", 24));
        assertEquals("", personAjith.withAddressAndAge("-f", "India",42));
    }
}