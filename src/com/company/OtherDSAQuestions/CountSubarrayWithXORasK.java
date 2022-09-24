package com.company.OtherDSAQuestions;

class CountSubarrayWithXORasK{

    public static void main(String[] args){
        int[] arr = {4,2,2,6,4};
        int k = 6;
        getMaxSubarray(arr,k);
    }
    public static int getMaxSubarray(int[] arr,int k){
        int sum = 0;
        int maxarr = 0;
        for(int i=0;i<arr.length;i++){
            sum ^= arr[i];
            if(sum==k){
                max
            }
        }
    } 



}