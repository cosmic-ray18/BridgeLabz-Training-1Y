package com.gla.PracticeProblem.Wrapper_classes;

public class Wrapper_Primitives {
    public static void main(String[] args) {
        Integer i = null;

        Integer j = Integer.valueOf(i);
        Double d = Double.valueOf(i);
        Float f = Float.valueOf(i);
        Long l = Long.valueOf(i);
        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("d: " + d);
        System.out.println("f: " + f);
        System.out.println("l: " + l);

        System.out.println("-------------------");

        Integer I = i;
        System.out.println("Byte: " + I.byteValue());
        System.out.println("Int: "  + I.intValue());
        System.out.println("Long: " + I.longValue());
        System.out.println("Float: " + I.floatValue());
        System.out.println(I.doubleValue());
        System.out.println(I.shortValue());

    }
}