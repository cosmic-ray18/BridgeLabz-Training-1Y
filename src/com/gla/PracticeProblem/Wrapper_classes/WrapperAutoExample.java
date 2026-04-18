package com.gla.PracticeProblem.Wrapper_classes;

public class WrapperAutoExample {
    public static void main(String[] args) {
        //Autoboxing
        int a = 10;
        Integer i = a;//Mannual Approach
        //Integer i =Integer.valueof(a) // Compiler will run internally
        System.out.println("Autoboxing: " + i);
                System.out.println("---------------------------------");

        Integer b = 120;
        int m = b; //Manual Approach
        // int m = b.intValue(); //compiler side
        System.out.println("Unboxing: " + m);
    }
}