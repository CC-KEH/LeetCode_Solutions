package com.company.DataStructuresOne.Strings;

import java.sql.SQLOutput;
import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "aabba", t = "abaab";
        System.out.println(isAnagram(s, t));
        System.out.println(isAnagramApproachTwo(s,t));
    }

    private static boolean isAnagramApproachTwo(String s, String t) {
            if(s.length()!=t.length()) return false;

            for (int i=0; i<s.length(); i++) {
                char curr = s.charAt(i);
                t = t.replaceFirst(""+curr,"");
            }

            return t.length() == 0;
        }

    private static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(hm.containsKey(s.charAt(i))){
                int count = hm.get(s.charAt(i));
                hm.put(s.charAt(i),++count);
            }else{
                hm.put(s.charAt(i),1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if(hm.containsKey(t.charAt(i))){
                int count = hm.get(t.charAt(i));
                hm.put(t.charAt(i),--count);
            }else{
                hm.put(t.charAt(i),1);
            }
        }
        for (int i = 0; i <s.length() ; i++) {
            if(hm.get(s.charAt(i))>0){
                return false;
            }
        }
        return true;
    }
}
