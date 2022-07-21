package com.company.DataStructuresOne.LinkedList;

import java.util.LinkedList;

public class RemoveElements {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 6;
        System.out.println(list);
        System.out.println(removeElements(list,target));
    }

    private static LinkedList removeElements(LinkedList<Integer> list,int target) {
//        public ListNode removeElements(ListNode head, int target) {
//            ListNode temp = head;
//
//            while(temp!=null) {
//                if(temp.val == target){
//                    head = temp.next;
//                }
//                if(temp.next.val==target && temp.next!=null){
//                    temp.next = temp.next.next;
//                }
//                temp = temp.next;
//            }
//
//            return head;
//        }
        return list;
    }
}
