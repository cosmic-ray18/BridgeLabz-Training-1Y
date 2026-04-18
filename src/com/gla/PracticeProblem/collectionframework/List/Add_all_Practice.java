package com.gla.PracticeProblem.collectionframework.List;

import java.util.ArrayList;
import java.util.*;

public class Add_all_Practice {
    public static void main(String[] args) {
        List list = new ArrayList();
        List list2 = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list.addAll(list2);
        System.out.println(list);

    }
}
