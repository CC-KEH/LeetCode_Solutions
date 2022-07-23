package com.company.DataStructuresOne.Stacks;

import java.util.Stack;

public class QueueUsingStacks {

     static class MyQueue{
         Stack<Integer> st1 = new Stack<>();
         Stack<Integer> st2 = new Stack<>();

        public void push(int x) {
            st1.push(x);
        }

        public int pop() {
            while(!st1.isEmpty()){
            st2.push(st1.pop());
            }
            int pooped = st2.pop();
            while(!st2.empty()){
                st1.push(st2.pop());
            }
            return pooped;
        }

        public int peek() {
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
            int pooped = st2.peek();
            while(!st2.isEmpty()){
                st1.push(st2.pop());
            }
            return pooped;
        }

        public boolean empty() {
            return st1.isEmpty();
        }
    }
    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        System.out.println(obj.peek());
        System.out.println(obj.pop());
        System.out.println(obj.empty());
    }
}
