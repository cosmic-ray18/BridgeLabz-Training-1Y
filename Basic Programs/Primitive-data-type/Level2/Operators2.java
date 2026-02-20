import java.util.Scanner;

class Operators2 { 

public static void main (String [] args ){

Scanner input = new Scanner(System.in);

System.out.println("INPUT THE NUMBERS:");
double a = input.nextInt();
double b = input.nextInt();
double c = input.nextInt();

double opt1 = a+b*c;
double opt2 = a*b+c;
double opt3 = c+a/b;
double opt4 = a%b+c;

System.out.print("The results of Int operations are " + opt1 + "," + opt2 +"," + opt3 + " and " + opt4);
 
 }
} 