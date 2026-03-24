package com.gla.handling.Assignment;

import java.util.Scanner;

public class CalculateInterest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
           System.out.print("Enter the amount: ");
            double amount = sc.nextDouble();
            System.out.print("Enter the interest rate: ");
            double rate = sc.nextDouble();
            System.out.print("Enter the years: ");
            int years = sc.nextInt();
            double Interest = calculateInterest(amount,rate,years);
                System.out.println("Your interest is " + Interest);
            }
        catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
        public static double calculateInterest(double amount , double rate , int years) throws IllegalArgumentException{
            if (amount < 0 || rate < 0 ) {
                throw new IllegalArgumentException("Invalid Input");
            }
            return (amount*rate*years)/100;
    }

}
