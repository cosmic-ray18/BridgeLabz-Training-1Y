package com.gla.PracticeProblem.Streamapi;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamApi6Practice {
    public static void main (String[] args ){
        //Other way to create stream using stream()
        ArrayList<Integer> al = new ArrayList<>();
        al.add(11);
        al.add(22);
        al.add(33);
        al.add(44);

        System.out.println("-------------Using Stream----------");
        Stream<Integer> stm = al.stream();
        stm.forEach(n-> System.out.println(n));
    }
}
