package com.gla.handling.Assignment;

public class Propagation_Example {
    public static void main(String[] args) {
        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }
    }
      public static void method2(){
          method1();
        }
      public static void method1() throws ArithmeticException{
          int num = 10/0;
        }
}
