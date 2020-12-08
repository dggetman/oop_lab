package ru.ssau.tk._emptiness_._tasks.operations;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SqrtOperationTest {
    private final static double DELTA = 0.00001;
    SqrtOperation identical = new SqrtOperation();

    @Test
    public void testApply() {
        assertEquals(identical.apply(3), Math.sqrt(3), DELTA);
        assertEquals(identical.apply(Double.NEGATIVE_INFINITY), Double.NaN, DELTA);
        assertEquals(identical.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, DELTA);
        assertEquals(identical.apply(Double.NaN), Double.NaN, DELTA);
    }

    @Test
    public void testApplyTriple() {
        assertEquals(identical.applyTriple(3), Math.sqrt(Math.sqrt(Math.sqrt(3))), DELTA);
        assertEquals(identical.applyTriple(Double.NEGATIVE_INFINITY), Double.NaN, DELTA);
        assertEquals(identical.applyTriple(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, DELTA);
        assertEquals(identical.applyTriple(Double.NaN), Double.NaN, DELTA);
    }
}