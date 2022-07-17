package com.company.DataStructuresOne.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {8, 7, 2,4,3, 10, 12};
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    private static int[] twoSum(int[] arr, int target) {
//        ---BruteForce--- O(n^2)

//        Arrays.sort(arr);
//        int pt = 0;
//        while(arr[pt]<target){
//            pt++;
//        }
//        boolean found = false;
//        for (int i = 0; i < pt; i++) {
//            for (int j = 0; j < pt; j++) {
//                if(arr[i] + arr[j] == target){
//                    System.out.println(i+""+j);
//                    found = true;
//                    break;
//                }
//            }
//            if(found){
//                break;
//            }
//        }
//      O(n)
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(hm.containsKey(target-arr[i])){
                return new int[] {hm.get(target-arr[i]),i};
            }else{
                hm.put(arr[i],i);
            }
        }
        return new int[] {-1,-1};
    }

}
