package com.gla.PracticeProblem.Streamapi;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamApi7Pratice_s {
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<>();
        al.add("Ghanshyam");
        al.add("Raju");
        al.add("Bihari");
        al.add("bijju");
        System.out.println("----------------Using Stream---------------");
        Stream<String> stm = al.stream();
        stm.forEach(n-> System.out.println(n));
    }
}
