import java.util.Scanner;

class Quot_Rem { 

public static void main (String [] args ){

Scanner input = new Scanner(System.in);

System.out.println("INPUT THE NUMBERS:");
int num1 = input.nextInt();
int num2 = input.nextInt();

int Quotient = num1/num2;
int Remainder = num1%num2;

System.out.println("The Quotient is " + Quotient + " and Remainder is " + Remainder + " of two number " + num1 + " and " + num2);
 
 }
} 
