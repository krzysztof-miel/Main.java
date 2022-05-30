package com.exaple.sortingtask;

public class Main {
    /**
     *
     * @param args
     */

    public static void main(String[] args) {
        int[] a = new int[] {3, 2, 1};
        Sorting.sort(a);
        for (int i:a){
            System.out.print(i + " ");
        }
    }
}
