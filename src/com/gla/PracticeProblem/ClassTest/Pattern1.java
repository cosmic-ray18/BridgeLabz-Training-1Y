package com.gla.PracticeProblem.ClassTest;

public class Pattern1 {
    public static void main(String [] args ){
        String[][]  arr = new String[7][4];
        int n = 3;
         for (int i = ;i<4;i++){
             for (int j = n-i;j<n+i;j++){
                 System.out.println("*");
                 System.out.println();
             }
         }
    }
}
