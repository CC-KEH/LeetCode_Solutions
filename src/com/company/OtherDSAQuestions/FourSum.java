package com.company.OtherDSAQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {

    }

    public List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                int target2 = target - (nums[j] + nums[i]);
                int low = j + 1;
                int high = nums.length - 1;
                while(low<high) {
                    int two_sum = nums[low] + nums[high];
                    if (two_sum < target2) low++;
                    else if(two_sum>target2) high--;
                    else{
                        res.add(Arrays.asList(nums[i],nums[j],nums[low],nums[high]));
                        while(low<high && nums[low]==nums[low+1]) low++;
                        while(low<high && nums[high]==nums[high-1]) high--;
                    }
                }
            }
        }
        return res;
    }
}
