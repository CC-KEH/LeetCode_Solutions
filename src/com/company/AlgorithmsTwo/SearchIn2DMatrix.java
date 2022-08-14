package com.company.AlgorithmsTwo;

public class SearchIn2DMatrix {
    public static void main(String[] args) {

    }
    public static boolean search(int[][] nums, int target) {
        int lowerBound = 0;
        int upperBound = nums[0].length-1;
        while(lowerBound<nums.length && upperBound>=0){
            if(nums[lowerBound][upperBound] == target){
                return true;
            }
            if(nums[lowerBound][upperBound]>target){
                upperBound--;
            }
            if(nums[lowerBound][upperBound]<target){
                lowerBound++;
            }

        }
        return false;
    }

    private static boolean binarySearchIt(int[][] nums, int lowerBound, int upperBound, int target) {
        int row = lowerBound;
        while(lowerBound<=upperBound){
           int mid = lowerBound + (upperBound-lowerBound)/2;
            if(nums[row][mid]<target){
                upperBound = mid-1;
            }
            else if(nums[row][mid]>target){
                lowerBound = mid+1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
