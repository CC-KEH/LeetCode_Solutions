package com.company.AlgorithmOne.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int target = 12;
        System.out.println(binarySearch(arr,target));
    }

    private static int binarySearch(int[] arr,int target) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid  = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}