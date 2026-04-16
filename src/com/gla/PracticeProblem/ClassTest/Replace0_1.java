package com.gla.PracticeProblem.ClassTest;

import java.util.Scanner;

public class Replace0_1 {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int temp = num;
        int size = 0;

        while(temp>0){
            size++;
            temp/=10;
        }
        int[] arr = new int[size];
        for (int i = 0;i<size;i++){
            arr[i] = num % 10;
            num /= 10;
            if (arr[i] == 0){
                arr[i] = 1;
            }
        }
        for (int i = 0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
}
