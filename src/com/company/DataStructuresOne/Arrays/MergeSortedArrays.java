package com.company.DataStructuresOne.Arrays;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {0, 0, 0, 1, 2, 3};
        int[] arr2 = {2, 5, 6};
        merge(arr1, arr2);
    }

    private static void merge(int[] arr1, int[] arr2) {
        int i = 0;
        int k = 0;
        int[] res = new int[arr1.length + arr2.length];
        int j = 0;
        while (i < arr1.length && k < arr2.length) {
            if (arr1[i] == 0) {
                i++;
                continue;
            }
            if (arr2[k] == 0) {
                k++;
                continue;
            }
            if (arr1[i] < arr2[k]) {
                res[j] = arr1[i];
                i++;
            } else {
                res[j] = arr2[k];
                k++;
            }
            j++;
        }
        while (i < arr1.length) {
            if (arr1[i] == 0) {
                i++;
                continue;
            }
            res[j] = arr1[i];
            i++;
            j++;
        }
        while (k < arr2.length) {
            if (arr2[k] == 0) {
                k++;
                continue;
            }
            res[j] = arr2[k];
            k++;
            j++;
        }
        System.out.println(Arrays.toString(res));
    }
}
