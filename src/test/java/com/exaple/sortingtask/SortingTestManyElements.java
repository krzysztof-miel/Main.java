package com.exaple.sortingtask;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SortingTestManyElements {


    private int[] arr;
    private int[] expected;

    public SortingTestManyElements(int[] arr, int[] expected){
        this.arr = arr;
        this.expected = expected;


    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new int[][]{{3, 2, 1}, {1, 2, 3}},
                new int[][]{{5,3,4,1,2}, {1,2,3,4,5}},
                new int[][]{{90,89,78,67,56,45,23,12,1,0}, {0,1,12,23,45,56,67,78,89,90}},
                new int[][]{{15,14,13,12,11,1,2,3,4,5,6,7,8,9,0,20}, {0,1,2,3,4,5,6,7,8,9,11,12,13,14,15,20}}
        );
    }


    @Test
    public void testManyElementsArrayCase(){
        int[] expArr = expected;
        int[] tested = Sorting.sort(arr);

        Assert.assertArrayEquals(expArr, tested);
    }
}
