package com.gla.PracticeProblem.Wrapper_classes;

class Basic_wrapper {
    static Integer i = 5; // Autoboxing ( complier runs valueof() internally in system)
    public static void main(String[] args) {
        int I = i; // AutoUnboxing ( complier runs intValue() internally)
        System.out.println("i = " + I);
    }
}