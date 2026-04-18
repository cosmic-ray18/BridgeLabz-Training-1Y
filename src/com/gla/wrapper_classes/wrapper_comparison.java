package com.gla.wrapper_classes;

public class wrapper_comparison {
    public static void main (String [] args ){
        Integer a = new Integer(100);
        Integer b = new Integer(100);
        Integer c = new Integer(200);
        Integer d = new Integer(200);

        System.out.println(a==b);
        System.out.println(c==d);
        System.out.println(a.equals(b));
    }
}
