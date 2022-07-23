package com.company.DataStructuresOne.Stacks;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s =  "){";
        System.out.println(isValid(s));
    }

    private static boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }

        Stack<Character> st = new Stack<>();
        st.push(' ');
        for(int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)== ')'){
                if(st.peek()=='('){
                    st.pop();
                }
                else return false;
                }
            else if(s.charAt(i)== ']'){
                if(st.peek()=='['){
                    st.pop();
                }
                else return false;
            }
            else if(s.charAt(i)== '}'){
                if(st.peek()=='{'){
                    st.pop();
                }
                else return false;
            }
            else{
                st.push(s.charAt(i));
            }
        }
        st.pop();
        return st.isEmpty();
    }
}
