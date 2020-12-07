package ru.ssau.tk._emptiness_._tasks;

import org.testng.annotations.Test;
import ru.ssau.tk._emptiness_._tasks.person.Person;

import static org.testng.Assert.*;

public class PersonTest {

    private final static double DELTA = 0.00001;

    @Test
    public void testMethods() {
        Person firstObj = new Person();
        Person secondObj = new Person();
        firstObj.setFirstName("Geralt");
        secondObj.setFirstName("Yennefer");
        firstObj.setLastName("zRivii");
        secondObj.setLastName("zVengerbergu");
        firstObj.setPassportId(99997777);
        secondObj.setPassportId(66661313);
        assertEquals(firstObj.getFirstName(), "Geralt");
        assertEquals(secondObj.getFirstName(), "Yennefer");
        assertEquals(firstObj.getLastName(), "zRivii");
        assertEquals(secondObj.getLastName(), "zVengerbergu");
        assertEquals(firstObj.getPassportId(), 99997777, DELTA);
        assertEquals(secondObj.getPassportId(), 66661313, DELTA);
    }
    //Task 1.11


    Person firstObj = new Person();
    Person secondObj = new Person("Naruto", "Uzumaki");
    Person thirdObj = new Person(null, null, 88888888);
    Person fourthObj = new Person(88888888);

    @Test
    public void testFirstNameMethods() {
        firstObj.setFirstName("Naruto");
        secondObj.setFirstName(null);
        assertEquals(firstObj.getFirstName(), "Naruto");
        assertNull(secondObj.getFirstName());
        assertNull(thirdObj.getFirstName());
        assertNull(fourthObj.getFirstName());
    }

    @Test
    public void testLastNameMethods() {
        fourthObj.setLastName(null);
        assertNull(firstObj.getLastName());
        assertEquals(secondObj.getLastName(), "Uzumaki");
        assertNull(fourthObj.getLastName());
    }

    @Test
    public void testPassportIDMethods() {
        secondObj.setPassportId(77777777);
        fourthObj.setPassportId(99999999);
        assertEquals(firstObj.getPassportId(), 0);
        assertEquals(secondObj.getPassportId(), 77777777);
        assertEquals(fourthObj.getPassportId(), 99999999);
    }
}