import java.util.Scanner;

class Not_zero_neg{ 

public static void main (String [] args ){

Scanner input = new Scanner(System.in);

double total = 0.0;

System.out.println("Enter a Number ");

while (true){
	double number = input.nextDouble();
if ( number == 0 || number <0){
break;
}
total += number;
}
System.out.print(total);

input.close();

}
}
