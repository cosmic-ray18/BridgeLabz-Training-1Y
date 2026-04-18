package com.gla.PracticeProblem.Array;

import java.util.Scanner;
public class freq_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int n2 = n;
        int count = 0;

        int index;
        for(index = 0; n2 != 0; ++count) {
            n2 /= 10;
        }

        int[] arr;
        for(arr = new int[count]; n != 0; ++index) {
            int digit = n % 10;
            n /= 10;
            arr[index] = digit;
        }

        int[] processed = new int[count];

        for(int i = 0; i < count; ++i) {
            int z = 0;

            for(int k = 0; k < count; ++k) {
                if (arr[i] == processed[k]) {
                    ++z;
                }
            }

            if (z <= 0) {
                int frequency = 0;

                for(int j = 0; j < count; ++j) {
                    if (arr[i] == arr[j]) {
                        ++frequency;
                    }
                }

                System.out.println(arr[i] + " has frequency: " + frequency);
                processed[i] = arr[i];
            }
        }

        sc.close();
    }
}
