package com.kateromaniv.app.homework.lesson8;

import com.kateromaniv.app.utils.ArraysAsParams;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static com.kateromaniv.app.utils.Consts.RESOURCES_PATH_ARRAYS;
import static java.util.Arrays.copyOfRange;

/*Created by katr on 26.04.2017.
 */
public class SelectionSortClass {
    SelectionSort selectionSort;
    private static final String INPUT_DATA = RESOURCES_PATH_ARRAYS + "forSortArrayInput.txt";
    private static int[][] inputData = null;
    private static final String OUTPUT_DATA = RESOURCES_PATH_ARRAYS + "forSortArrayOutput.txt";
    private static int[][] outputData = null;

    @Before
    public void preConditionsForTest() throws IOException {
        inputData = ArraysAsParams.readTheFile(INPUT_DATA);
        outputData = ArraysAsParams.readTheFile(OUTPUT_DATA);
    }

    @Before
    public void setUp(){selectionSort = new SelectionSort();}

    @Test
    public void selectionSortTest(){
        for (int i = 0; i < inputData.length; i++) {
            int[] inputArray = copyOfRange(inputData[i], 0, inputData[i].length);
            int[] outputArray = copyOfRange(outputData[i], 0, outputData[i].length);
            Assert.assertArrayEquals(outputArray, SelectionSort.selectionSort(inputArray));
        }
    }
}
