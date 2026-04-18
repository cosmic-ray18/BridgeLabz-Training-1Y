package com.gla.PracticeProblem.collectionframework.List;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        String s = "Hello";
        Stack<Character> st = new Stack<>();

        for (int i=0; i<s.length();i++) {
            st.push(s.charAt(i));
        }

        for (int i =0;i<s.length();i++){
            System.out.print(st.pop() + " ");
        }
    }
}
