import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NameTest {
    @Test
    public void test_that_gives_the_first_and_last_name_of_a_person() throws Exception {
        Name name = new Name("SaranRaj","Sekar");
        assertEquals("SaranRaj Sekar",name.firstLast(" "));
    }

    @Test
    public void test_that_gives_the_last_and_first_with_comma_name_of_a_person() throws Exception {
        Name name = new Name("SaranRaj","Sekar");
        assertEquals("Sekar, SaranRaj",name.lastFirst(", "));
    }
}