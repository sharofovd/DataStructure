package rumail.Test;

import org.junit.Test;

import static org.junit.Assert.*;
import static rumail.Test.Gender.FEMALE;
import static rumail.Test.Gender.MALE;

public class PeopleTest {
   private People vasya = new People("Vasay", MALE);
   private People pert = new People("Petr", MALE);
   private People kate = new People("Kate", FEMALE);

    @Test
    public void testMarryPersonWithSameGender() {
        assertFalse(vasya.marry(pert));
        assertNull(vasya.getSpouse());
        assertNull(pert.getSpouse());
    }

    @Test
    public void testMarry() {
        assertTrue(vasya.marry(kate));
        assertEquals(kate, vasya.getSpouse());
        assertEquals(vasya, kate.getSpouse());
    }

}