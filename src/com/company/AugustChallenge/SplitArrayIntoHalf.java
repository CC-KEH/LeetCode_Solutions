package com.company.AugustChallenge;

import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SplitArrayIntoHalf {
    public static void main(String[] args) {
        System.out.println(minSetSize(new int[] {1,1,1,2,2,2,3,3,5,5,5,6,7}));
    }

    public static int minSetSize(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int targetSize = arr.length/2;
        for(int n : arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        List<Integer> freq = new ArrayList<>(map.values());
        Collections.sort(freq,Collections.reverseOrder());
        int count = 0;
        int i =0;
        int tElements = arr.length;
        while(tElements>targetSize){
            tElements = tElements-freq.get(i);
            i++;
            count++;
        }
        return count;
    }
}
