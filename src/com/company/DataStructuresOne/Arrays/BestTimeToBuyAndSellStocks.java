package com.company.DataStructuresOne.Arrays;

public class BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }

    private static int maxProfit(int[] arr) {
        if(arr.length==0){
            return 0;
        }
        int minSoFar = arr[0];
        int maxProfit = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
           minSoFar = Math.min(minSoFar,arr[i]);
           int profit = arr[i] - minSoFar;
           maxProfit = Math.max(profit,maxProfit);
        }
        return maxProfit;
    }

//    Approach 2
//    private static int maxProfit(int[] prices) {
//        if(prices.length==0){
//            return 0;
//        }
//        int[] maxArr = new int[prices.length];
//        int max = Integer.MIN_VALUE;
//        for(int i = prices.length-1; i >=0 ; i--) {
//            maxArr[i] = findMax(prices,i);
//        }
//        for (int i = 0; i < prices.length; i++) {
//            max = Math.max(max,maxArr[i] - prices[i]);
//        }
//        return max;
//    }
//
//    private static int findMax(int[] prices, int i) {
//        int max = Integer.MIN_VALUE;
//        for (int j = i; j < prices.length; j++) {
//            max = Math.max(max,prices[j]);
//        }
//        return max;
//    }
}
