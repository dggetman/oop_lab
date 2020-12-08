package ru.ssau.tk._emptiness_._tasks.operations;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TangentOperationTest {
    private final static double DELTA = 0.00001;
    TangentOperation identical = new TangentOperation();

    @Test
    public void testApply() {
        assertEquals(identical.apply(3), Math.tan(3), DELTA);
        assertEquals(identical.apply(Double.NEGATIVE_INFINITY), Double.NaN, DELTA);
        assertEquals(identical.apply(Double.POSITIVE_INFINITY), Double.NaN, DELTA);
        assertEquals(identical.apply(Double.NaN), Double.NaN, DELTA);
    }

    @Test
    public void testApplyTriple() {
        assertEquals(identical.applyTriple(3), Math.tan(Math.tan(Math.tan(3))), DELTA);
        assertEquals(identical.applyTriple(Double.NEGATIVE_INFINITY), Double.NaN, DELTA);
        assertEquals(identical.applyTriple(Double.POSITIVE_INFINITY), Double.NaN, DELTA);
        assertEquals(identical.applyTriple(Double.NaN), Double.NaN, DELTA);
    }
}