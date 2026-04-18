package com.gla.PracticeProblem.Streamapi;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamApi8Practice {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Ghanshyam");
        al.add("Raju");
        al.add("Bihari");
        al.add("bijju");
        System.out.println("----------------Using Stream---------------");
        Stream<String> stm = al.stream();
        Stream<String> FilterStream = stm.filter(n->n.startsWith("A"));
        FilterStream.forEach(System.out::println);
    }
}
