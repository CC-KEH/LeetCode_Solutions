package com.company.AlgorithmOne.BinarySearch;

//https://leetcode.com/problems/first-bad-version/

public class FirstBadVersion {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 5, 9, 12};
        int bad = 4;
        //firstBadVersion(arr, bad);
    }

//    private static void firstBadVersion(int[] arr, int bad) {
//        int start = 1;
//        int end = bad;
//        int mid;
//        int result = bad;
//        while(start<=end){
//            mid = start + (end-start)/2;
//            if(isBadVersion(mid)){
//                result = mid;
//                end = mid-1;
//            }else{
//                start = mid+1;
//            }
//        }
//        return result;
//    }
}
