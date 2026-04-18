package com.gla.wrapper_classes;

public class Wrap_to_Prim{
    public static void main(String[] args) {
        System.out.print("Primitive type of Variable: ");
        Double d = new Double(45.67);
        System.out.println(d);
        System.out.print("Wrapper type of Variable: ");
        double d2 = d.doubleValue();
        System.out.println(d2);
        System.out.print("change Double type in int type by using casting: ");
        int i = (int) d2;
        System.out.println(i);
        }
    }