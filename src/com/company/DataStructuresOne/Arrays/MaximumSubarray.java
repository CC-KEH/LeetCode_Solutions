package com.company.DataStructuresOne.Arrays;

//https://leetcode.com/problems/maximum-subarray/
import java.util.Arrays;


public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArraySum(arr));
    }

    private static int maxSubArraySum(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int currSum = 0;
        int sum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(currSum<0){
                currSum = 0;
            }
            currSum+=arr[i];
            sum = Math.max(currSum,sum);
        }
        return sum;
    }
}
