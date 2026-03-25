import java.util.Scanner;

class Handshake { 

public static void main (String [] args ) {

Scanner input = new Scanner(System.in);

int students = input.nextInt();

if (students >=2){
float handshakes = (students *(students-1))/2;
System.out.print(" Total number of possible handshakes is " + handshakes);
}
else { 
System.out.print("No handshakes possible");
  }
 }
} 