import java.util.Scanner;

class DMAS { 

public static void main (String [] args ){

Scanner input = new Scanner(System.in);

System.out.println("INPUT THE NUMBERS:");
float num1 = input.nextFloat();
float num2 = input.nextFloat();

double div = num1/num2;
double mul = num1*num2;
double add = num1 + num2;
double sub = num1 - num2;

System.out.print("The addition,subtraction,multiplication and division value of 2 numbers " + num1 + " and " + num2 + " is " + add + "," + sub +
                 "," + mul + " and " + div);
		}			 
}		