package com.company.DataStructuresOne.Strings;

import java.util.HashMap;

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aaba", magazine = "aab";
        System.out.println(canConstruct(ransomNote,magazine));
    }

    private static boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()){
            return false;
        }
        HashMap<Character,Integer> hm =new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            if(hm.containsKey(ransomNote.charAt(i))){
                int count = hm.get(ransomNote.charAt(i));
                hm.put(ransomNote.charAt(i),++count);
            }
            else{
                hm.put(ransomNote.charAt(i),1);
            }
        }
        for(int i = 0; i < magazine.length(); i++) {
           if(hm.containsKey(magazine.charAt(i))){
               int count = hm.get(magazine.charAt(i));
               hm.put(magazine.charAt(i),--count);
            }
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if(hm.get(ransomNote.charAt(i))>0){
                return false;
            }
        }
        return true;
    }
}
