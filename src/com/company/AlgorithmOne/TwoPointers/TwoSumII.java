package com.company.AlgorithmOne.TwoPointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSumII {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        System.out.println(Arrays.toString(twoSumII(arr, target)));
    }

    private static int[] twoSumII(int[] arr, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {
            if(hm.containsKey(target-arr[i])){
                return new int[] {hm.get(target-arr[i]),i+1};
            }
            else{
                hm.put(arr[i],i+1);
            }
        }
        return new int[] {-1,-1};
    }

}
