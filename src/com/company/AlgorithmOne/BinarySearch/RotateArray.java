package com.company.AlgorithmOne.BinarySearch;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        System.out.println(Arrays.toString(rotateArray(arr,k)));
    }

    private static int[] rotateArray(int[] arr,int k) {

        int maxRange = (arr.length-1)-k;
        int[] newArr = new int[arr.length];
        for(int i = 0; i <= maxRange; i++) {
            newArr[i+k] = arr[i];
        }
        int j = 0;
        for (int i = maxRange+1; i < arr.length; i++) {
            newArr[j] = arr[i];
            j++;
        }
        return newArr;
    }
}
