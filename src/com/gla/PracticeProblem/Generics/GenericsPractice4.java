package com.gla.PracticeProblem.Generics;

public class GenericsPractice4 {
    public static<T extends Number> void fib(int n){
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            if (i<=1){
                arr[i] = i;
                System.out.print(arr[i] + " ");
            }
            else{
                arr[i] = arr[i-1]+arr[i-2];
                System.out.print(arr[i]+" ");
            }

        }
    }
    public static void main(String[] args) {
        fib(50);
    }
}