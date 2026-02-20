import java.util.Scanner;

class Totalprice { 

public static void main ( String[] args ){

Scanner input = new Scanner (System.in);

System.out.print(" Quantity: ");
int quantity = input.nextInt();
System.out.print(" Unitprice: ");
double unitprice = input.nextDouble();

double total = quantity*unitprice;

System.out.print("The total purchase price is INR " + total + " if the quantity " + quantity + " and unit price is INR " + unitprice);
 }
}