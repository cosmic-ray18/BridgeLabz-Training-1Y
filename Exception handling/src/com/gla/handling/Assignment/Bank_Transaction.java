package com.gla.handling.Assignment;

import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class Bank_Transaction {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the amount you want to withdraw: ");
            double amount = sc.nextInt();
            double newBalance = withdraw(amount);
            System.out.println("Withdrawl successful , new balance: " + newBalance);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static double withdraw(double amount) throws InsufficientBalanceException, IllegalArgumentException {
        double Balance = 20000;
        if (amount > Balance) {
            throw new InsufficientBalanceException("Insufficient Balance!");
        } else if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }
        return Balance - amount;
    }
}


