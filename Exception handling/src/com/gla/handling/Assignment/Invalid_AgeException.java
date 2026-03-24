package com.gla.handling.Assignment;

import java.util.Scanner;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

public class Invalid_AgeException {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = scan.nextInt();
            ValidateAge(age);
        }
        catch ( InvalidAgeException e){
            System.out.println("Caught Invalid_AgeException: " + e.getMessage());
        }
    }
    public static void ValidateAge(int age) throws InvalidAgeException {
        if(age<18){
            throw new InvalidAgeException("Age must be 18 or above");
        }
        else {
            System.out.println("Access granted!");
        }
    }
}
