package com.gla.PracticeProblem.collectionframework.List;

import java.util.*;

public class Linked_List {
    public static void main (String[] args){

        LinkedList<Integer> ll = new LinkedList<>();
        Vector<Boolean> vector = new Vector<>();
        Stack<Integer> st = new Stack<>();
           st.push(1);
           st.push(2);
           st.push(3);
           st.push(4);
           System.out.println(st);
           System.out.println(st.peek());
           st.pop();
           System.out.println(st);
           System.out.println(st.peek());
           System.out.println(st.size());
           System.out.println(st.isEmpty());

           //LinkedList
        System.out.println("------------LinkedList-------------");
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.addAll(st);
        System.out.println(ll);
    }
}