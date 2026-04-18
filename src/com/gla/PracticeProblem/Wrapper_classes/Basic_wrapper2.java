package com.gla.PracticeProblem.Wrapper_classes;

class Basic_wrapper2 {
    static Integer I = null;
    public static void main(String[] args) {
        try {
            int i = I;
            System.out.println("i = " + i);
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());}
    }
}