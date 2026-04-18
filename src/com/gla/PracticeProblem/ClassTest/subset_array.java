package com.gla.PracticeProblem.ClassTest;

import java.util.Scanner;

public class subset_array {
    public static void main (String[] args ){

        Scanner sc = new Scanner(System.in);
        int sizeA = sc.nextInt();
        int sizeB = sc.nextInt();

        int [] arrA = new int[sizeA];
        int [] arrB = new int[sizeB];

        System.out.println("Enter the elements of Array A: ");
        for (int i = 0;i<sizeA;i++){
            arrA[i] = sc.nextInt();
        }
        for (int i = 0;i<sizeB;i++){
            arrB[i] = sc.nextInt();
        }
        int count = 0;
        for (int i=0;i<sizeB;i++){
            for (int j = 0;j<sizeA;j++){
                if (arrB[i] == arrA[j]){
                    count++;
                }
            }
        }
        if (count == sizeB) {
            System.out.println("arrB is a subset of arrA ");
        }
            else{
                System.out.println("arrB is not a subset of arrA");
        }

    }
}
