package com.company.AlgorithmOne.TwoPointers;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] str = {'h', 'e', 'l', 'l', 'o'};
        reverseString(str);
    }

    static  void reverseString(char[] s) {
        reverseString(s, 0, s.length - 1);
        System.out.println(Arrays.toString(s));
    }

    static char[] reverseString(char[] sb, int left, int right) {
        if (left >= right) {
            return sb;
        }
        char temp = sb[left];
        sb[left] = sb[right];
        sb[right] = temp;
        return reverseString(sb, left + 1, right - 1);
    }

}
