import org.junit.Test;

import static org.junit.Assert.*;

public class GenderTest {
    @Test
    public void test_prefix_for_male() throws Exception {
        Gender male = Gender.Male;
        assertEquals(male.title(),"Mr ");
    }

    @Test
    public void test_prefix_for_female() throws Exception {
        Gender female = Gender.Female;
        assertEquals(female.title(),"Ms ");
    }
}