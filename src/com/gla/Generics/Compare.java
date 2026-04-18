package com.gla.Generics;

public class Compare{
public static <T> boolean isEqual(T a , T b) {
    return a.equals(b);
}
    public static void main(String[] args) {
        System.out.println(isEqual("Radhe","Radhe"));
        System.out.println(isEqual(4,5));
        System.out.println(isEqual(4.54,4.54));
    }
}
