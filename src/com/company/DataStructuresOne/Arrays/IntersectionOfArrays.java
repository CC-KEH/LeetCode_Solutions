package com.company.DataStructuresOne.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {4,5};
        System.out.println(Arrays.toString(intersect(arr1, arr2)));
    }

    private static int[] intersect(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] == arr2[j]){
                arrayList.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        if(arrayList.size()==0){
            return new int[] {};
        }
        else {
            int[] res = new int[arrayList.size()];
            for (int l = 0; l < res.length; l++) {
                res[l] = arrayList.get(l);
            }
            return res;
        }
    }
}
