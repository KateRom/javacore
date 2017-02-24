package com.KateRom.app.classwork.lesson4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OddNumberTest {
    OddNumber oddNumber;

    @Before
    public void setUp(){
        oddNumber = new OddNumber();
    }

    @Test
    public void isItOddFalseTest () {
        int a = 2;
        Assert.assertArrayEquals(new boolean[] {OddNumber.isNumberOdd(a)}, new boolean[] {false});
    }
    @Test
    public void isItOddTest () {
        int a = 3;
        Assert.assertArrayEquals(new boolean[]{OddNumber.isNumberOdd(a)}, new boolean[]{true});
    }
    @Test
    public void isItOddMinusTest () {
        int a = -3;
        Assert.assertArrayEquals(new boolean[]{OddNumber.isNumberOdd(a)}, new boolean[]{true});
    }
}
