package com.kateromaniv.app.homework.lesson3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.Locale;
import java.util.Stack;

public class DoubleFunctionTest {
    DoubleFunction doubleFunction;

    @Before
    public void setUp() {
        doubleFunction = new DoubleFunction();
    }
    @Test
    public void doubleEqualsTest () {
        double obj1 = 10.0;
        double obj2 = 10;
        Assert.assertEquals(true, DoubleFunction.doubleEquals(obj1, obj2));
    }
    @Test
    public void doubleEqualsNegatveTest () {
        double obj1 = 10.0;
        double obj2 = 11;
        Assert.assertEquals(false, DoubleFunction.doubleEquals(obj1, obj2));
    }
    @Test
    public void convertToStringTest (){
        Date date = new Date(7, 1, 12);
        String expResult = "Tue Feb 12 00:00:00 EET 1907";
        Assert.assertEquals(expResult, DoubleFunction.convertToString(date));
    }
    @Test
    public void idCountryTest (){
        Locale locale = new Locale("UKRAINIAN", "Ukr");
        String expResult = "UKR";
        Assert.assertEquals(expResult, DoubleFunction.idCountry(locale));
    }
    @Test
    public void myStackTest () {
        Stack stack = new Stack();
        Assert.assertEquals(true, DoubleFunction.myStack(stack));
    }
    @Test
    public void myStackTest2 () {
        Stack<String> stack = new Stack<>();
        stack.push("code");
        Assert.assertEquals(false, DoubleFunction.myStack(stack));
    }
}

