import java.util.Scanner;

class Operators { 

public static void main (String [] args ){

Scanner input = new Scanner(System.in);

System.out.println("INPUT THE NUMBERS:");
int a = input.nextInt();
int b = input.nextInt();
int c = input.nextInt();

int opt1 = a+b*c;
int opt2 = a*b+c;
int opt3 = c+a/b;
int opt4 = a%b+c;

System.out.print("The results of Int operations are " + opt1 + "," + opt2 +"," + opt3 + " and " + opt4);
 
 }
} 