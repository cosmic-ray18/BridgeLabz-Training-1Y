package com.gla.handling.Assignment;

import java.util.Scanner;

public class Multiple_catch {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        try {
        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();
        System.out.println("Enter the array elements");
        int [] arr = new int[size];
        for (int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter the Index of the element you want to catch: ");
        int value = scan.nextInt();
        System.out.println("Value at Index: "+value+arr[value]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index! " + e.getMessage());
        }
        catch (NullPointerException e){
            System.out.println("Array is not initialized!" + e.getMessage());
        }

    }
}
