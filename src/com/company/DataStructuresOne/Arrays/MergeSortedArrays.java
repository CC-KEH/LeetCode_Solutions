package com.company.DataStructuresOne.Arrays;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,3,4,7,8,9};
        int[] arr2 = {2,5,6,8,10};
        int[] arr = merge(arr1,arr2);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] merge(int[] arr1, int[] arr2) {
        int i = 0;
        int k = 0;
        int[] res = new int[arr1.length + arr2.length];
        int j = 0;
        while(i<arr1.length && k<arr2.length){
            if(arr1[i]<arr2[k]){
                res[j] = arr1[i];
                i++;
            }else{
                res[j] = arr2[k];
                k++;
            }
            j++;
        }
        while(i<arr1.length){
            res[j] = arr1[i];
            i++;
            j++;
        }
        while(k<arr2.length){
            res[j] = arr2[k];
            k++;
            j++;
        }
        return res;
    }
}
