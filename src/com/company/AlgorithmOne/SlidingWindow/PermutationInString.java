package com.company.AlgorithmOne.SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PermutationInString {
    public static void main(String[] args) {
        String s1 = "abc", s2 = "eidabcoo";
        System.out.println(checkInclusion(s1, s2));
        System.out.println(checkInclusionApproachTwo(s1,s2));
    }

    private static boolean checkInclusionApproachTwo(String s1, String s2) {
            int len1 = s1.length(), len2 = s2.length();
            if (len1 > len2) return false;

            int[] count = new int[26];
            for (int i = 0; i < len1; i++) {
                count[s1.charAt(i) - 'a']++;
            }

            for (int i = 0; i < len2; i++) {
                count[s2.charAt(i) - 'a']--;
                if(i - len1 >= 0) count[s2.charAt(i - len1) - 'a']++;
                if (allZero(count)) return true;
            }

            return false;
        }
    private static boolean allZero(int[] count) {
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) return false;
        }
        return true;
    }

    //Time-Limit exceeds
    private static boolean checkInclusion(String s1, String s2) {
        if (s2.length() == 0 || s2 == null || s1.length() > s2.length()) {
            return false;
        }
        int i = 0, j = s1.length();
        while (!isAnagram(s1, s2.substring(i, j)) && j < s2.length()) {
            i++;
            j++;
        }
        return isAnagram(s1, s2.substring(i, j));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        } else if (s.equals(t)) {
            return true;
        } else {
            HashMap<Character, Integer> hm = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                if (hm.containsKey(s.charAt(i))) {
                    int count = hm.get(s.charAt(i));
                    hm.put(s.charAt(i), ++count);
                } else {
                    hm.put(s.charAt(i), 1);
                }
            }
            for (int i = 0; i < t.length(); i++) {
                if (hm.containsKey(t.charAt(i))) {
                    int count = hm.get(t.charAt(i));
                    hm.put(t.charAt(i), --count);
                } else {
                    hm.put(t.charAt(i), 1);
                }
            }
            for (int i = 0; i < s.length(); i++) {
                if (hm.get(s.charAt(i)) > 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
