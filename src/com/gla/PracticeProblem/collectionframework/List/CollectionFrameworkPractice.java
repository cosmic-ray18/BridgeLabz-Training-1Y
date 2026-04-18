package com.gla.PracticeProblem.collectionframework.List;

import java.util.*;
public class CollectionFrameworkPractice {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add("Jai");
        list.add(7.898);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.contains("Jay"));
        System.out.println(list.hashCode());
        System.out.println(list.size());
    }
}
