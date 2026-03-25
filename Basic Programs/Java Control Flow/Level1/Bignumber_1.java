import java.util.Scanner;

class Bignumber_1{ 

public static void main (String [] args ){

Scanner input = new Scanner(System.in);

System.out.println("INPUT THE NUMBERS:");
int a = input.nextInt();
int b = input.nextInt();
int c = input.nextInt();

if (a<b && a<c){
System.out.print("1st number is the smallest in 3 numbers");
}
else {
System.out.print("it is not the smallest in 3");
}

input.close();
 }
}