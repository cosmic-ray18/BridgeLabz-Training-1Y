package com.gla.PracticeProblem.collectionframework.List;

import java.util.*;

public class CollectionFrameworkPractice2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        List list2 = new LinkedList();
        List list3 = new Vector();
        List list4 = new Stack();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add("Kite");
        list.add(7.77);
        System.out.println(list);

        //Creating Arraylist
        ArrayList<String> list5 = new ArrayList<>();
        System.out.println("Empty Array: " + list5);
        list5.add("Radhe");
        list5.add("shyam");
        list5.add("shiva");
        System.out.println(list5);
        System.out.println("-----------------------------");
        System.out.println("Using simple for loop");
        for (int i = 0; i < list5.size(); i++) {
            System.out.println(list5.get(i));
        }
        System.out.println("-----------------------------");
        System.out.println("Using for each loop");
        for (String s: list5){
            System.out.println(s);
        }
    }
}
