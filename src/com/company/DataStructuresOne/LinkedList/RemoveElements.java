package com.company.DataStructuresOne.LinkedList;

import java.util.LinkedList;

public class RemoveElements {
    public static void main(String[] args) {
        System.out.println("Refer to the function below");
        //System.out.println(removeElements(list,target));
    }

//    public ListNode removeElements(ListNode head, int target) {
//        if(head==null){
//            return null;
//        }
//        while (head != null){
//            if(head.val == target) head = head.next;
//            else break;
//        }
//        ListNode temp = new ListNode(0,head);
//
//        while(temp.next!=null) {
//            if(temp.next.val==target){
//                temp.next = temp.next.next;
//            }
//            else{
//                temp = temp.next;
//            }
//        }
//        return head;
//    }

//  Another approach i found  by user https://leetcode.com/yavinci/

//    public ListNode removeElements(ListNode head, int val) {
//        if(head == null) return null;
//        ListNode next = removeElements(head.next, val);
//        if(head.val == val) return next;
//        head.next = next;
//        return head;
//    }
}
