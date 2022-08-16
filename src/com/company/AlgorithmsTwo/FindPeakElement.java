package com.company.AlgorithmsTwo;

public class FindPeakElement {
    public static void main(String[] args) {
        System.out.println(findPeakElement(new int[]{1,2,1,3,5,6,4}));
    }
    public static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(nums[mid+1] > nums[mid]){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return end;
    }
}
