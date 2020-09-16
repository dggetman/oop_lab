package ru.ssau.tk._emptiness_._first;

import org.testng.annotations.Test;

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
}