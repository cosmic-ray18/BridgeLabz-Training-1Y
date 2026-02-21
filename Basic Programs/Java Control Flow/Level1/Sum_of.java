import java.util.Scanner;

class Sum_of { 

public static void main (String [] args ){

Scanner input = new Scanner(System.in);

System.out.println("INPUT THE NUMBER:");
int num = input.nextInt();
int sum = 0;

if (num>0){

sum = num*(num+1)/2;
System.out.print("The sum of " + num + " natural numbers is " + sum );
}
else {
System.out.print("The number " + num + " is not a natural number ");
}
input.close();
 }
} 