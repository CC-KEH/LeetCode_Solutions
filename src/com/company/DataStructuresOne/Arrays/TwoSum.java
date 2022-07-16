package com.company.DataStructuresOne.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {8, 7, 1, 10, 12};
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        twoSum(arr, target);
    }

    private static void twoSum(int[] arr, int target) {
        Arrays.sort(arr);
        int pt = 0;
        while(arr[pt]<target){
            pt++;
        }
        boolean found = false;
        for (int i = 0; i < pt; i++) {
            for (int j = 0; j < pt; j++) {
                if(arr[i] + arr[j] == target){
                    System.out.println(i+""+j);
                    found = true;
                    break;
                }
            }
            if(found){
                break;
            }
        }

    }

}
