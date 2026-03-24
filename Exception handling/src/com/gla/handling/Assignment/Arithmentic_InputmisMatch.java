package com.gla.handling.Assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Arithmentic_InputmisMatch {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       try {
       System.out.print("Enter a first number: ");
       int num1 = input.nextInt();
       System.out.print("Enter a second number: ");
       int num2 = input.nextInt();

            double result = num1 / num2;
           System.out.println(result);
            }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception caught: " + e.getMessage());
        }

            catch (InputMismatchException e ){
                System.out.println("Input MismatchException caught: " + e.getMessage());
            }
    }
}
