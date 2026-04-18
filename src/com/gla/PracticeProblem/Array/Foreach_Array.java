package com.gla.PracticeProblem.Array;

public class Foreach_Array {
        public static void main(String[] args) {
            int[] arr = new int[]{10, 20, 30, 40};
            System.out.println("Update array elements");
            arr[0] = 50;
            System.out.println("For-each Example: ");

            for(int num : arr) {
                System.out.println(num);
            }

        }
    }

