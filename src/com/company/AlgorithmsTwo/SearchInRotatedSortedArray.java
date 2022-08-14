package com.company.AlgorithmsTwo;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {

    }
    public int search(int[] nums, int target) {
        int minIndex = searchPivot(nums);

        if(target>nums[0] && target>nums[minIndex]){
            return search(nums,0,minIndex-1,target);
        }
        else{
            return search(nums,minIndex,nums.length,target);
        }
    }

    public int search(int[] nums,int left,int right,int target){
        int l = left;
        int r = right;
        // System.out.println(left+" "+right);
        while(l <= r){
            int mid = l + (r - l)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return -1;
    }

    public int searchPivot(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if( mid > 0 && nums[mid-1] > nums[mid]){
               return mid;
            }
            else if(nums[mid] <= nums[start] && nums[mid] > nums[end]){
                start = mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return start;
    }
}
