package com.exaple.sortingtask;

import org.junit.Assert;
import org.junit.Test;



public class SortingTest {


    @Test (expected = IllegalArgumentException.class)
    public void testNullCase(){
        Sorting.sort(null);
    }

    @Test
    public void testZeroElementCase() {
        int[] arr = {};
        Sorting.sort(arr);
        Assert.assertArrayEquals(arr, new int[]{});
    }

    @Test
    public void testSingleElementArrayCase() {
        int[] arr = {1};
        Sorting.sort(arr);
        Assert.assertArrayEquals(arr, new int[] {1});
    }




}
