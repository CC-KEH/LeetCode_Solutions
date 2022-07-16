package com.company.AlgorithmOne.BinarySearch;

import java.util.Arrays;

public class SquareOfSortedArray {
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,5,7};
        squareAndSort(arr);
    }

    private static void squareAndSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]*arr[i];
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
