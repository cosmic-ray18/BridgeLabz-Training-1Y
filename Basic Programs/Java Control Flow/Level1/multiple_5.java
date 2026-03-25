import java.util.Scanner;

class multiple_5 { 

public static void main (String [] args ){

Scanner input = new Scanner(System.in);

System.out.println("INPUT THE NUMBER:");
int a = input.nextInt();

if ( a%5 == 0){
System.out.print("Number is divisble by 5");
}
else {
System.out.print("Number is not divisble by 5");
}

input.close();
 }
} 