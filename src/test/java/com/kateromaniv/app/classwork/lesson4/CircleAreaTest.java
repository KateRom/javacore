package com.kateromaniv.app.classwork.lesson4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CircleAreaTest {
    CircleArea circleArea;

    @Before
    public void setUp(){
        circleArea = new CircleArea();
    }
    @Test
    public void calculateTest() {
        double radius = 3.88;
        double expResult = 47.29;
        Assert.assertEquals(expResult, CircleArea.calculate(radius), 0.01);
    }

    @Test
    public void calculateZeroTest() {
        double radius = 0;
        double expResult = 0.0;
        Assert.assertEquals(expResult, CircleArea.calculate(radius), 0.01);
    }

    @Test
    public void calculateIntTest() {
        int radius = 2;
        double expResult = 12.56;
        Assert.assertEquals(expResult, CircleArea.calculate(radius), 0.01);
    }

    @Test
    public void calculateIntMinusTest() {
        int radius = -2;
        double expResult = 0.0;
        Assert.assertEquals(expResult, CircleArea.calculate(radius), 0);
    }

    @Test
    public void calculateIntZeroTest() {
        int radius = 0;
        double expResult = 0.0;
        Assert.assertEquals(expResult, CircleArea.calculate(radius), 0);
    }

    @Test
    public void catchExceptionTest() {
        try {
            int radius = Integer.parseInt("a");
            Assert.fail("No exception cached");
        } catch (java.lang.NumberFormatException e){
        }
    }

    @Test(expected = NumberFormatException.class)
    public void catchExceptionTest2() {
        int radius = Integer.parseInt("a");
        Assert.fail("No exception cached");
    }
}