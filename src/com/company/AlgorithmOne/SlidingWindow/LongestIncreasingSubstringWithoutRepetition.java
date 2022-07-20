package com.company.AlgorithmOne.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestIncreasingSubstringWithoutRepetition {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    private static int lengthOfLongestSubstring(String s) {
        if(s==null || s.length()==0){
            return 0;
        }
        int i = 0, j=0, max = 0;
        Set<Character> set = new HashSet<>();
        while(i<s.length()){
            char c = s.charAt(i);
            while(set.contains(c)){
                set.remove(c);
                ++j;
            }
            set.add(c);
            max = Math.max(max,i-j+1);
            ++i;
        }
        return max;

    }

}
