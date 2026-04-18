package com.gla.PracticeProblem.Streamapi;

import java.util.ArrayList;
import java.util.stream.Stream;

    public class StreamApi9Practice {
        public static void main(String[] args) {
            ArrayList<String> al = new ArrayList<>();
            al.add("Ghanshyam");
            al.add("Raju");
            al.add("Bihari");
            al.add("Bijju");
            System.out.println("----------------Using Stream---------------");
       al.stream().filter(n->n.startsWith("B")).forEach(System.out::println);
        }
    }
