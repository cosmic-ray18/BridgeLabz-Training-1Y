import java.util.Scanner;

class Unicharge { 

public static void main ( String [] args ) { 

Scanner input = new Scanner(System.in); 

System.out.println("FEE:");
int fee = input.nextInt();
System.out.println("DiscountPercent:");
double discountPercent = input.nextInt();

double discount = (fee*discountPercent)/100;
double finalfee = fee - discount;

System.out.print("The discount amount is INR " + discount + " and the final discounted fee is INR " + finalfee);
 }
} 