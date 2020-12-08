package ru.ssau.tk._emptiness_._tasks.point;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ResettableIntGeneratorTest {
    ResettableIntGenerator generator = new ResettableIntGenerator();

    @Test
    public void testNextInt() {
        assertEquals(generator.nextInt(), 0);
        assertEquals(generator.nextInt(), 1);
        assertEquals(generator.nextInt(), 2);
    }

    @Test
    public void testReset() {
        generator.reset();
        assertEquals(generator.nextInt(), 0);
        assertEquals(generator.nextInt(), 1);
        assertEquals(generator.nextInt(), 2);
    }

    @Test
    public void testGetName() {
        assertEquals(generator.getName(), "Absent");
    }
}