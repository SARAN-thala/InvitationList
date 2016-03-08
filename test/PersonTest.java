import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void test_get_informal_name_with_title() throws Exception {
        Name name = new Name("Ajith", "Kumar");
        Address address = new Address("Chennai", "TamilNadu", "India");
        Gender gender = Gender.Male;
        Person person = new Person(name, gender, 40, address);
        String expected = "Mr Ajith Kumar";
        assertEquals(expected, person.getNameWithTitle(true));
    }

    @Test
    public void test_get_formal_name_with_title() throws Exception {
        Name name = new Name("Ajith", "Kumar");
        Address address = new Address("Chennai", "TamilNadu", "India");
        Gender gender = Gender.Male;
        Person person = new Person(name, gender, 40, address);
        String expected = "Mr Kumar, Ajith";
        assertEquals(expected, person.getNameWithTitle(false));
    }

    @Test
    public void test_get_informal_name_with_country() throws Exception {
        Name name = new Name("Ajith", "Kumar");
        Address address = new Address("Chennai", "TamilNadu", "India");
        Gender gender = Gender.Male;
        Person person = new Person(name, gender, 40, address);
        String expected = "Mr Ajith Kumar, India";
        assertEquals(expected, person.getNameWithCountry());
    }

    @Test
    public void test_get_formal_name_with_country() throws Exception {
        Name name = new Name("Ajith", "Kumar");
        Address address = new Address("Chennai", "TamilNadu", "India");
        Gender gender = Gender.Male;
        Person person = new Person(name, gender, 40, address);
        String expected = "Mr Kumar, Ajith, India";
        assertEquals(expected, person.getNameWithCountry(false));
    }
}