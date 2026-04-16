package com.gla.PracticeProblem.ClassTest;

import java.util.Scanner;

public class anagrams {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            String str2 = sc.nextLine();

            int match = 0;
            for (int i = 0;i<str.length();i++) {
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str2.charAt(j)) {
                        match++;
                    }
                }
            }

            if (match <str.length()){
                System.out.println("They both are not anagrams");
            }
            else {
                System.out.println("Both are anagrams");
            }
    }


}
