package com.gla.PracticeProblem.Generics;

public class GenericsPractice3 {
    public static <T> void fibonacci(T t) {
        int n = Integer.parseInt(t.toString());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if (i<=1){
                System.out.println(i);
                arr[i] = i;
            }
            else {
                arr[i] = arr[i-2] +arr[i-1];
                System.out.println(arr[i]);
            }

    }
}
public static void main(String[] args) {
        fibonacci(51);
}
}
