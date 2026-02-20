import java.util.Scanner;

class Periside { 
public static void main ( String [] args ){

Scanner input = new Scanner(System.in);

System.out.print("Perimeter of Square: ");
double perimeter = input.nextDouble();

double side = perimeter/4;

System.out.print("The length of the side is " + side + " whose perimeter is " + perimeter);

 }
} 