package com.company.DataStructuresOne.Strings;

//https://leetcode.com/problems/first-unique-character-in-a-string/

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

public class FirstUniqueCharacterInString {
    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }

    private static int firstUniqChar(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(hm.containsKey(s.charAt(i))){
                int count = hm.get(s.charAt(i));
                hm.put(s.charAt(i),++count);
            }else{
                hm.put(s.charAt(i),1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            if(hm.get(sc)==1){
                return i;
            }
        }
        return -1;
    }
}
