package ru.ssau.tk._emptiness_._tasks.point;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NamedPointTest {
    NamedPoint unnamedPoint = new NamedPoint(3., 4., 5.);
    NamedPoint firstPoint = new NamedPoint(3., 4., 7., "First");
    NamedPoint origin = new NamedPoint();

    @Test
    public void testReset() {
        NamedPoint origin = new NamedPoint();
        origin.reset();
        assertEquals(origin.getName(), "Absent");
    }

    @Test
    public void testGetName() {
        assertNull(unnamedPoint.getName());
        assertEquals(firstPoint.getName(), "First");
        assertEquals(origin.getName(), "Origin");
    }

    @Test
    public void testSetName() {
        unnamedPoint.setName("Second");
        firstPoint.setName("Third");
        origin.setName("First");
        assertEquals(unnamedPoint.getName(), "Second");
        assertEquals(firstPoint.getName(), "Third");
        assertEquals(origin.getName(), "First");
    }
}