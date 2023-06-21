package com.company;

import  org.junit.Test;
import static org.junit.Assert.*;

public class TesttNumbersTest {

    @Test
    public void sum() {
        TesttNumbers obj = new TesttNumbers();
        int actual = obj.sum(10);
        int expected = 50;
        assertEquals(expected,actual);
    }
}