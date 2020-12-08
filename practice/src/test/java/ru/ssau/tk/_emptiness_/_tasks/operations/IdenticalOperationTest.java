package ru.ssau.tk._emptiness_._tasks.operations;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IdenticalOperationTest {
    private final static double DELTA = 0.00001;
    IdenticalOperation identical = new IdenticalOperation();

    @Test
    public void testApply() {
        assertEquals(identical.apply(3), 3, DELTA);
        assertEquals(identical.apply(Double.NEGATIVE_INFINITY), Double.NEGATIVE_INFINITY, DELTA);
        assertEquals(identical.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, DELTA);
        assertEquals(identical.apply(Double.NaN), Double.NaN, DELTA);
    }

    @Test
    public void testApplyTriple() {
        assertEquals(identical.applyTriple(3), 3, DELTA);
        assertEquals(identical.applyTriple(Double.NEGATIVE_INFINITY), Double.NEGATIVE_INFINITY, DELTA);
        assertEquals(identical.applyTriple(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, DELTA);
        assertEquals(identical.applyTriple(Double.NaN), Double.NaN, DELTA);
    }
}