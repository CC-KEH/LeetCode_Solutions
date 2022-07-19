package com.company.AlgorithmOne.TwoPointers;

import java.util.LinkedList;

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        middleNode(list);
    }

    private static void middleNode(LinkedList<Integer> list) {
        boolean found = false;
        int length = list.size();
        int mid = length/2;
        for (int i = 0; i < length; i++) {
            if(found){
                System.out.print(list.get(i));
            }
            if(i==mid){
                System.out.print(list.get(i));
                found = true;
            }
        }
    }
}
