package com.gla.PracticeProblem.collectionframework.Map;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
public class MapPractice {
    public static void main (String[] args){
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(2,90);
        hm.put(6,88);
        hm.put(3,78);
        hm.put(1,99);
        for (int i :hm.keySet()){
            System.out.println(i);
        }
        for (int i :hm.values()){
            System.out.println(i);
        }
        System.out.println("Values:" + hm.values());
        System.out.println("Keys: " + hm.keySet());
        LinkedHashMap<Integer,Integer> lm = new LinkedHashMap<>();
        TreeMap<Integer,String > tm = new TreeMap<>();
    }
}
