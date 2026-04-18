package com.gla.wrapper_classes;

import java.util.*;

public class Prim_to_Wrapper{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int m = input.nextInt();
        //Primitive type of m variable
        System.out.println("Primitive type of m varibale: ");
        System.out.println(m);
        System.out.println("Wrapper class type of m varibale: ");
        Integer i1 = new Integer(m);
        System.out.println(i1);


    }
}