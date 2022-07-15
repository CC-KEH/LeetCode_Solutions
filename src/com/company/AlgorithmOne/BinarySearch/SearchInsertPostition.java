package com.company.AlgorithmOne.BinarySearch;

//https://leetcode.com/problems/search-insert-position/

public class SearchInsertPostition {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 4;
        System.out.println(searchInsert(arr,target));
    }

    private static int searchInsert(int[] arr,int target) {
    int start = 0;
    int end = arr.length-1;
    if(arr[start]==target){
        return start;
    }else if(arr[end] == target){
        return end;
    }
    while(start<=end){
        int mid = start +(end-start)/2;
        if(arr[mid]==target){return mid;}
        else if(arr[mid]>target){
            end = mid-1;
        }else{
            start = mid+1;
        }
    }
    return start;
    }
}