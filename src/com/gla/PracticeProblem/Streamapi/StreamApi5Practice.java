package com.gla.PracticeProblem.Streamapi;

import java.util.stream.Stream;

public class StreamApi5Practice {
    public static void main (String[] args ){
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6);
       stream.forEach(System.out::println);
    }
}