package com.company.OtherDSAQuestions;

public class UniquePaths {
    public static void main(String[] args) {
        int m = 51;
        int n = 9;
        int[][] dp = new int[m][n];
        System.out.println(uniquePaths(m-1,n-1,dp));
    }
    public static int uniquePaths(int m, int n,int[][] dp) {
        if (m < 0 || n < 0) return 0;

        if(m==0 && n==0) return 1;

        if(dp[m][n]>0){
            return dp[m][n];
        }
        else{
            dp[m][n] = uniquePaths(m-1,n,dp) + uniquePaths(m,n-1,dp);
        }
        return dp[m][n];
    }
}
