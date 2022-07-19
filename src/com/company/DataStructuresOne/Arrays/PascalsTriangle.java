package com.company.DataStructuresOne.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int rows = in.nextInt();
        System.out.println(generate(rows));
    }

    private static List<List<Integer>> generate(int rows) {
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        for(int i = 1; i <= rows; i++) {
            List<Integer> arrRow = new ArrayList<Integer>();
            for (int j = 1; j <= i; j++) {
                if(j==i || j==1){
                    arrRow.add(1);
                }else{
                    int prevSum = (arr.get(i-2).get(j-2) + arr.get(i-2).get(j-1));
                    arrRow.add(j-1,prevSum);
                }
            }
            arr.add(arrRow);
        }
        return arr;
    }
}
