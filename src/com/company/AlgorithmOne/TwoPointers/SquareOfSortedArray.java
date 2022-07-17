package com.company.AlgorithmOne.TwoPointers;

import java.util.Arrays;

public class SquareOfSortedArray {
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,5,7};
        squareAndSort(arr);
    }

    private static void squareAndSort(int[] arr) {
//        Approach 1 O(n^2)
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = arr[i]*arr[i];
//        }
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

//         Approach 2
                int start = 0, last = arr.length-1;
                int square[] = new int[last+1];
                int index = last;
                while(start<=last)
                {
                    if(Math.abs(arr[last])>Math.abs(arr[start]))
                    {
                        square[index--] = (int)Math.pow(arr[last],2);
                        last--;
                    }
                    else
                    {
                        square[index--] = (int)Math.pow(arr[start],2);
                        start++;
                    }
                }
        System.out.println(Arrays.toString(square));;
            }
        }
