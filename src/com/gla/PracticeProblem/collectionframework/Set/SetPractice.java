package com.gla.PracticeProblem.collectionframework.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetPractice {
    public static void main (String [] args){
        HashSet<Integer> hs = new HashSet<>();
        hs.add(88);
        hs.add(0);
        hs.add(63);
        hs.add(1);
        hs.add(63);
        System.out.println("=========================HashSet======================");
        System.out.println(hs);
        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(2);
        ls.add(3);
        ls.add(5);
        ls.add(7);
        ls.add(11);
        System.out.println("=========================LinkedHashSet======================");
        System.out.println(ls);
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(63);
        ts.add(72);
        ts.add(81);
        System.out.println("=========================TreeSet======================");
        System.out.println(ts);
    }
}
