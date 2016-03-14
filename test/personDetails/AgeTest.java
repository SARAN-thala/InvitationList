package personDetails;

import org.junit.Test;

import static org.junit.Assert.*;

public class AgeTest {
    @Test
    public void test_to_get_age() throws Exception {
        Age age = new Age("30");
        assertEquals(30,age.getAge());
    }

    @Test
    public void test_to_check_the_age_is_legal_to_have_alcohol_or_not() throws Exception {
        Age age = new Age("22");
        assertTrue(age.isLegal("20"));
        assertFalse(age.isLegal("30"));
    }
}