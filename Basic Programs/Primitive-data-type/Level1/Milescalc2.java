import  java.util.Scanner;

class Milescalc2 { 
public static void main (String [] args ) { 
Scanner sb = new Scanner(System.in);

int kms = sb.nextInt();

double miles = kms/1.6;

System.out.print("The total miles is " + miles + " mile for the given " + kms + " km");

 }
}
