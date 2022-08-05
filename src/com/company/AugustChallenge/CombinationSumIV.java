package com.company.AugustChallenge;

public class CombinationSumIV {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int target = 4;
        System.out.println(combinationSum4(nums, target));
    }

    public static int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int j = 1; j < dp.length; j++) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= j) {
                    dp[j] += dp[j - nums[i]];
                }
            }
        }
        return dp[target];
    }
}
