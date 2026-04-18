package com.gla.PracticeProblem.ClassTest;

import java.util.Scanner;

public class Friendlypair {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sizeA = 0;
        int sizeB = 0;
        for (int i = 0; i < a; i++) {
            if (a % i == 0) {
                sizeA++;
            }
        }
        int[] arrA = new int[sizeA];
        for (int i = 0; i < a; i++) {
            if (a % i == 0) {
                arrA[i] = i;
            }
        }

        for (int i = 0; i < b; i++) {
            if (b % i == 0) {
                sizeB++;
            }
        }

        int[] arrB = new int[sizeB];
        for (int i = 0; i < b; i++) {
            if (b % i == 0) {
                arrB[i] = i;
            }
        }

        int sumA = 0;
        int sumB = 0;

        for (int i = 0; i < arrA.length; i++) {
            sumA += arrA[i];
        }

        for (int i = 0; i < arrB.length; i++) {
            sumB += arrB[i];
        }

        if (a / sumA == 1 && b / sumB == 1) {
            System.out.println(a + "and " + b + "both are friendly pairs");
        } else {
            System.out.println("They are not friendly pairs");
        }
    }
}
