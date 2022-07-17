package com.company.AlgorithmOne.TwoPointers;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        System.out.println(Arrays.toString(rotateArray(arr, k)));
    }

    private static int[] rotateArray(int[] arr, int k) {
//        //Approach 1
//        int maxRange = (arr.length-1)-k;
//        int[] newArr = new int[arr.length];
//        for(int i = 0; i <= maxRange; i++) {
//            newArr[i+k] = arr[i];
//        }
//        int j = 0;
//        for (int i = maxRange+1; i < arr.length; i++) {
//            newArr[j] = arr[i];
//            j++;
//        }
//        return newArr;
//    }
        //Approach 2 Space Complexity - O(1)
        int len = arr.length;
        if(len == 1) return arr;

        if(k > len) k = k%len;
        if(k == len) return arr;
        reverseArray(0, (arr.length-1)-k, arr);
        reverseArray((arr.length)-k, arr.length-1, arr);
        reverseArray(0, arr.length-1, arr);
        return arr;
    }

    private static void reverseArray(int start,int end,int[] arr) {
        for (int i = start; i <= end; i++) {
            int temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;
            end--;
        }
    }
}
