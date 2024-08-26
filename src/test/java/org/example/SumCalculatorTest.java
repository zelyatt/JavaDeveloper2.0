package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {

    private SumCalculator sumCalculator;

    @BeforeEach

    public void setUp(){
        sumCalculator = new SumCalculator();
    }

    @Test
    public void testSumOne(){
        Assertions.assertEquals(1,sumCalculator.sum(1));
    }@Test
    public void testSumThree(){
        Assertions.assertEquals(6,sumCalculator.sum(3));
    }@Test
    public void testSumZero(){
        Assertions.assertThrows(IllegalArgumentException.class,()->sumCalculator.sum(0));
    }

}