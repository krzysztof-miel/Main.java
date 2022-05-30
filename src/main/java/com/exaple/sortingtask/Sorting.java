package com.exaple.sortingtask;

import java.util.Arrays;

public class Sorting {
    /**
     *
     * @param arr
     * @return
     */
    public static int[] sort(int[] arr){
        if (arr == null){
            throw new IllegalArgumentException();
        }else {
            Arrays.sort(arr);
        }

        return arr;
    }
}
