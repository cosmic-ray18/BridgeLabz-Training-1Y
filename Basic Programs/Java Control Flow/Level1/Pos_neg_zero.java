import java.util.Scanner;

class Pos_neg_zero{ 

public static void main (String [] args ){

Scanner input = new Scanner(System.in);

System.out.println("INPUT THE NUMBER:");
int num = input.nextInt();

if ( num>0){
System.out.print("Positive");
}
else if (num<0) {
System.out.print("Negative");
}
else {
System.out.print("Zero");
}
input.close();
 }
} 