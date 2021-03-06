package com.kateromaniv.app.homework.lesson6;

import com.kateromaniv.app.homework.lesson3.MathFunction;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.kateromaniv.app.utils.Consts.RESOURCES_PATH;

@RunWith(JUnitParamsRunner.class)
public class MathFuncScaleFactorTest {
    MathFunction mathFunction;

    @Before
    public void setUp(){mathFunction = new MathFunction();}

    @FileParameters(RESOURCES_PATH + "scale_factor_params.txt")

    @Test
    public void scaleFactorTest (double a, int b, double expResult) {
        Assert.assertEquals(expResult, MathFunction.scaleFactor(a, b), 0.1);
    }
}
