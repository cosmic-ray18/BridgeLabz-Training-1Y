package com.gla.handling.Assignment;

import java.util.Scanner;

public class Nested_Trycatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("size of the array: ");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the elements of the array");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
                System.out.println("Enter the index of the element in the array");
                int index = sc.nextInt();
                try {
                    System.out.println("Enter the divisor");
                    int divisor = sc.nextInt();
                    int result = arr[index] / divisor;
                    System.out.println("Array at index " + index + ": " + arr[index]);
                    System.out.println("Result of the division: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!" + e.getMessage());
                }
            }
         catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array Index: " + e.getMessage());
        }
        System.out.print("Rest of the code executes: ");
    }
}
